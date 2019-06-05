package us.christopherwmurphy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_area")
public class ProductAreaEntity{

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "product_area")
	private String productArea;

	public ProductAreaEntity() {
	}

	public ProductAreaEntity(Integer id) {
		this.id = id;
	}

	public ProductAreaEntity(Integer id, String productArea) {
		this.id = id;
		this.productArea = productArea;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductArea() {
		return this.productArea;
	}

	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
}
