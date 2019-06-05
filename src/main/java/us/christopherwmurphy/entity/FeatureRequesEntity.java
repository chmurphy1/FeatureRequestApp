package us.christopherwmurphy.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "feature_request")
public class FeatureRequesEntity implements Comparable<Integer>{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="priority")
	private Integer priority;
	
	@OneToOne
	@JoinColumn(name = "client_id", referencedColumnName = "id")
	private ClientsEntity clients;
	
	@OneToOne
	@JoinColumn(name = "product_id", referencedColumnName = "id")
	private ProductAreaEntity productArea;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="target_date")
	private Timestamp targetDate;

	public FeatureRequesEntity() {
	}

	public FeatureRequesEntity(Integer id, Integer priority, ClientsEntity clients, ProductAreaEntity productArea,
			String title, String description, Timestamp targetDate) {
		super();
		this.id = id;
		this.priority = priority;
		this.clients = clients;
		this.productArea = productArea;
		this.title = title;
		this.description = description;
		this.targetDate = targetDate;
	}
	
	public ClientsEntity getClients() {
		return this.clients;
	}

	public void setClients(ClientsEntity clients) {
		this.clients = clients;
	}

	public ProductAreaEntity getProductArea() {
		return this.productArea;
	}

	public void setProductArea(ProductAreaEntity productArea) {
		this.productArea = productArea;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getTargetDate() {
		return this.targetDate;
	}

	public void setTargetDate(Timestamp targetDate) {
		this.targetDate = targetDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return this.priority.compareTo(o);
	}
}
