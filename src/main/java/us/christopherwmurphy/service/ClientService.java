package us.christopherwmurphy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import us.christopherwmurphy.dto.Clients;
import us.christopherwmurphy.entity.ClientsEntity;
import us.christopherwmurphy.repository.ClientRepository;

public class ClientService {

	@Autowired
	ClientRepository cRepo;
	
	
	public List<Clients> getAllClients(){
		List<Clients> returnVal = new ArrayList<>();
		List<ClientsEntity> list = cRepo.findAll();
		
		for(ClientsEntity c : list) {
			returnVal.add(convertToClients(c));
		}
		
		return returnVal;		
	}
	
	private Clients convertToClients(ClientsEntity entity) {
		return new Clients(entity.getId(), entity.getClient());
	}
	
}
