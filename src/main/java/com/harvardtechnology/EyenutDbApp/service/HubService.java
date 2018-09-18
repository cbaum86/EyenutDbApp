/*
 * Copyright (c) 2016 Harvard Technology Ltd.
 * All rights reserved.
 *
 *
 *   This software is the confidential and proprietary information
 *   of Wimac Ltd. ("Confidential Information").  You shall not
 *   disclose such Confidential Information and shall use it only in
 *   accordance with the terms of the license agreement you entered
 *   with Harvard Technology Ltd.
 *  
 */
package com.harvardtechnology.EyenutDbApp.service;

import java.util.List;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harvardtechnology.EyenutDbApp.model.Hub;
import com.harvardtechnology.EyenutDbApp.repository.HubRepository;

/**
 * @author cbaum
 *
 */
@Service
public class HubService {
	
	@Autowired HubRepository repository;
	
	public List<Hub> listAll() {
		return Lists.newArrayList(repository.findAll());
	}
	
	public Hub findById(int id) {
		return repository.findById(id).get();
	}
	
	public Hub findByName(String name) {
		return repository.findByHubName(name).get();
	}
	
	public List<Hub> listByIsAWS(boolean isAWS) {
		return Lists.newArrayList(repository.findAllByIsAWS(isAWS));
	}
	
	public Hub updateHub(Hub hub) {
		return repository.save(hub);
	}

}
