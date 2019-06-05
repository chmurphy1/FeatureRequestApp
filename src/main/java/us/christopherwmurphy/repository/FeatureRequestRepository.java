package us.christopherwmurphy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import us.christopherwmurphy.entity.FeatureRequesEntity;

public interface FeatureRequestRepository extends CrudRepository<FeatureRequesEntity, Integer> {

	@Query(value="Select * from feature_request order by id", nativeQuery = true)
	public List<FeatureRequesEntity> findAll();
	
	@Query(value="Select * from feature_request where client_id = :clientId order by priority", nativeQuery = true)
	public List<FeatureRequesEntity> findByClientId(Integer clientId);
}
