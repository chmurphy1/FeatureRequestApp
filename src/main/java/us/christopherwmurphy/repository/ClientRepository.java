package us.christopherwmurphy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import us.christopherwmurphy.entity.ClientsEntity;

public interface ClientRepository extends CrudRepository<ClientsEntity, Integer> {

	@Query(value="Select * from clients order by id", nativeQuery = true)
	public List<ClientsEntity> findAll();
}
