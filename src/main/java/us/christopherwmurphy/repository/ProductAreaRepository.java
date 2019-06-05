package us.christopherwmurphy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import us.christopherwmurphy.entity.ProductAreaEntity;

public interface ProductAreaRepository extends CrudRepository<ProductAreaEntity, Integer>{
	
	@Query(value="Select * from product_area order by id", nativeQuery = true)
	public List<ProductAreaEntity> findAll();
}
