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
package com.harvardtechnology.EyenutDbApp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.harvardtechnology.EyenutDbApp.model.Hub;
import com.harvardtechnology.EyenutDbApp.service.HubService;

/**
 * @author cbaum
 *
 */
@RestController
public class HubSelectController {
	
	@Autowired HubService hubService;
	
	@PostMapping(value="/hubSelectedState")
	public ResponseEntity<?> updateHubSelected(@Valid @RequestBody Integer hubId, Errors errors) {
				
		Hub myHub = hubService.findById(hubId);
		System.out.println("Old Value: " + myHub.getHubName() + " : " + myHub.isSelected());
		
		Boolean selectState = myHub.isSelected() ? false : true;
		
		myHub.setSelected(selectState);
		System.out.println("New Value: " + myHub.getHubName() + " : " + myHub.isSelected());
		
		hubService.updateHub(myHub);
		
		return ResponseEntity.ok(myHub);
	}

}
