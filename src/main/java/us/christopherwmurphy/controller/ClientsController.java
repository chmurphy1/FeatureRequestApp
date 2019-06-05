package us.christopherwmurphy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import us.christopherwmurphy.dto.Clients;
import us.christopherwmurphy.service.ClientService;

@RestController
public class ClientsController {
	
	@Autowired
	ClientService cServ;
	
	@GetMapping("/FeatureRequest/GetAllClients")
	public List<Clients> getAllClients(){
		return cServ.getAllClients();
	}
}
