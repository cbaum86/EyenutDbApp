package com.harvardtechnology.EyenutDbApp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.harvardtechnology.EyenutDbApp.model.Hub;

public interface HubRepository extends CrudRepository<Hub, Integer>{
	
	@Query("SELECT h FROM Hub h WHERE h.isAWS = :isAWS")
	List<Hub> findAllByIsAWS(@Param("isAWS") boolean isAWS);

	/**
	 * @param name
	 * @return
	 */
	Optional<Hub> findByHubName(String name);

}
