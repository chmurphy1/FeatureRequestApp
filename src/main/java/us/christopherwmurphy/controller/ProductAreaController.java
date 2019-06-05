package us.christopherwmurphy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import us.christopherwmurphy.dto.ProductArea;
import us.christopherwmurphy.service.ProductAreaService;

@RestController
public class ProductAreaController {
	@Autowired
	ProductAreaService paServ;
	
	@GetMapping("/FeatureRequest/GetAllProductAreas")
	public List<ProductArea> getAllProductAreas(){
		return paServ.getAllProductAreas();
	}
}
