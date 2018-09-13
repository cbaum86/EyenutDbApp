package com.harvardtechnology.EyenutDbApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.harvardtechnology.EyenutDbApp.service.HubService;
import com.harvardtechnology.EyenutDbApp.service.QueryService;

@Controller
public class HubController {
	
	@Autowired HubService hubService;
	@Autowired QueryService queryService;
	
	@RequestMapping("/hubs")
	public String hubList(Model model) {
		
		model.addAttribute("hubs", hubService.listAll());
		model.addAttribute("awsHubs", hubService.listByIsAWS(true));
		
		model.addAttribute("queries", queryService.listAll());
		
		return "/hubs";
		
	}

}
