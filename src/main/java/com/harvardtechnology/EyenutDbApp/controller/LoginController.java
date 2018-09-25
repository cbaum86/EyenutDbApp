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

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cbaum
 *
 */
@Controller
public class LoginController {
	
	String pageTitle = "Login :: EyeNut Database App";
	
	@RequestMapping("/login")
	public String login(Model model) {
		
		model.addAttribute("pageTitle", pageTitle);
		
		return "/login";
	}

}
