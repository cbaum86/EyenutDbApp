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

import com.harvardtechnology.EyenutDbApp.model.Query;
import com.harvardtechnology.EyenutDbApp.repository.QueryRepository;

/**
 * @author cbaum
 *
 */
@Service
public class QueryService {
	
	@Autowired QueryRepository repository;
	
	public List<Query> listAll() {
		return Lists.newArrayList(repository.findAll());
	}
	
	public Query findByIdd(int id) {
		return repository.findById(id).get();
	}

}
