package us.christopherwmurphy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Clients {

	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("client")
	private String client;

	public Clients() {
		
	}
	
	public Clients(Integer id, String client) {
		super();
		this.id = id;
		this.client = client;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}
	
}
