package us.christopherwmurphy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class ClientsEntity{

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "client")
	private String client;

	public ClientsEntity() {
	}

	public ClientsEntity(Integer id) {
		this.id = id;
	}

	public ClientsEntity(Integer id, String client) {
		this.id = id;
		this.client = client;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClient() {
		return this.client;
	}

	public void setClient(String client) {
		this.client = client;
	}
}
