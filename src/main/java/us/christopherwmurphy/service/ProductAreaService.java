package us.christopherwmurphy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import us.christopherwmurphy.dto.ProductArea;
import us.christopherwmurphy.entity.ProductAreaEntity;
import us.christopherwmurphy.repository.ProductAreaRepository;

@Service
public class ProductAreaService {
	
	@Autowired
	ProductAreaRepository paRepo;

	public List<ProductArea> getAllProductAreas(){
		List<ProductArea> returnVal = new ArrayList<>();
		List<ProductAreaEntity> list = paRepo.findAll();
		
		for(ProductAreaEntity p : list) {
			returnVal.add(convertToProductArea(p));
		}
		return returnVal;
	}
	
	private ProductArea convertToProductArea(ProductAreaEntity entity) {
		return new ProductArea(entity.getId(), entity.getProductArea());
	}
}
