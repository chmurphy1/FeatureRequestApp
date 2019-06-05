package us.christopherwmurphy.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import us.christopherwmurphy.dto.FeatureRequest;
import us.christopherwmurphy.entity.ClientsEntity;
import us.christopherwmurphy.entity.FeatureRequesEntity;
import us.christopherwmurphy.entity.ProductAreaEntity;
import us.christopherwmurphy.repository.FeatureRequestRepository;

@Service
public class FeatureRequestService {

	@Autowired
	FeatureRequestRepository frRepo;
	
	public FeatureRequest save(FeatureRequest request) {
		List<FeatureRequesEntity> list = getAllRecordsForClient(request.getClient());
		FeatureRequesEntity returnVal = null;
		
		
		int index = Collections.binarySearch(list, request.getPriority());
		
		if(index < 0) {
			returnVal = frRepo.save(convertToEntity(request));
		}
		else {		
			List<FeatureRequesEntity> rearrange = new ArrayList<>();
			int previousVal = request.getPriority();
			
			for(;index < list.size(); index++) {
			
				int priority = list.get(index).getPriority();
				if(previousVal == priority) {
					previousVal = priority+1;
					FeatureRequesEntity f = list.get(index);
					f.setPriority(previousVal);					
					rearrange.add(f);
				}
				else {
					break;
				}
			}
			frRepo.saveAll(rearrange);
			returnVal = frRepo.save(convertToEntity(request));
		}
		return convertToJsonObj(returnVal);
	}
	
	public void delete(Integer id) {
		frRepo.deleteById(id);
	}
	
	
	public List<FeatureRequest> getAllRecords(){
		List<FeatureRequesEntity> dbRecords = frRepo.findAll();
		List<FeatureRequest> jsonRecords = new ArrayList<>();
		
		for(FeatureRequesEntity f : dbRecords) {
			jsonRecords.add(new FeatureRequest(f.getId(),
											   f.getTitle(),
											   f.getDescription(),
											   f.getClients().getId(),
											   f.getPriority(),
											   f.getTargetDate(),
											   f.getProductArea().getId()));
		}
		
		return jsonRecords;
	}
	
	private List<FeatureRequesEntity> getAllRecordsForClient(Integer clientId){
		return frRepo.findByClientId(clientId);
	}
	
	private FeatureRequesEntity convertToEntity(FeatureRequest request) {
		return new FeatureRequesEntity(null, 
				                       request.getPriority(), 
				                       new ClientsEntity(request.getClient()),
				                       new ProductAreaEntity(request.getProductArea()),
				                       request.getTitle(),
				                       request.getDescription(),
				                       request.getTargetDate());
	}
	
	private FeatureRequest convertToJsonObj(FeatureRequesEntity request) {
		return new FeatureRequest(request.getId(),
				request.getTitle(),
				request.getDescription(),
				request.getClients().getId(),
				request.getPriority(),
				request.getTargetDate(),
				request.getProductArea().getId());
	}
}
