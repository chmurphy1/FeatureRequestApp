package us.christopherwmurphy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import us.christopherwmurphy.dto.FeatureRequest;
import us.christopherwmurphy.service.FeatureRequestService;

@RestController
public class FeatureRequestController {

	@Autowired
	FeatureRequestService frServ;
	
	@PutMapping("/FeatureRequest/SaveFeatureRequest")
	public FeatureRequest save(@RequestParam(value="feature") FeatureRequest feature){
		return frServ.save(feature);
	}
	
	@DeleteMapping("/FeatureRequest/DeleteFeatureRequest")
	public void delete(@RequestParam(value="feature") Integer id){
		frServ.delete(id);
	}
	
	@GetMapping("/FeatureRequest/AllRecords")
	public List<FeatureRequest> getAllRecords(){
		return frServ.getAllRecords();
	}
}
