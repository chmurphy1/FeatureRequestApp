package us.christopherwmurphy.dto;

import java.sql.Timestamp;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FeatureRequest {

	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("client")
	private Integer client;
	
	@JsonProperty("priority")
	private Integer priority;
	
	@JsonProperty("targetDate")
	private Timestamp targetDate;
	
	@JsonProperty("productArea")
	private Integer productArea;
	
	public FeatureRequest() {
		
	}

	public FeatureRequest(Integer id, 
							String title, 
							String description, 
							Integer client, 
							Integer priority,
							Timestamp targetDate, 
							Integer productArea) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.client = client;
		this.priority = priority;
		this.targetDate = targetDate;
		this.productArea = productArea;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getClient() {
		return client;
	}
	public void setClient(Integer client) {
		this.client = client;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Timestamp getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Timestamp targetDate) {
		this.targetDate = targetDate;
	}
	public Integer getProductArea() {
		return productArea;
	}
	public void setProductArea(Integer productArea) {
		this.productArea = productArea;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}	
}
