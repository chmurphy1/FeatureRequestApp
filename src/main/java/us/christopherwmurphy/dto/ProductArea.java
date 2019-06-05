package us.christopherwmurphy.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductArea {

	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("productArea")
	private String productArea;

	public ProductArea() {
		
	}
	
	public ProductArea(Integer id, String productArea) {
		super();
		this.id = id;
		this.productArea = productArea;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductArea() {
		return productArea;
	}

	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}

}
