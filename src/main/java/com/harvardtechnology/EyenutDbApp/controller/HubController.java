package com.harvardtechnology.EyenutDbApp.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.harvardtechnology.EyenutDbApp.model.Hub;
import com.harvardtechnology.EyenutDbApp.service.HubService;
import com.harvardtechnology.EyenutDbApp.service.QueryService;

@Controller
public class HubController {
	
	@Autowired HubService hubService;
	@Autowired QueryService queryService;
	
	@RequestMapping("/hubs")
	public String hubList(Model model) {
		
		model.addAttribute("hubs", hubService.listAll());
		
		return "/hubs";
		
	}
	
	@RequestMapping(value = "/results", method=RequestMethod.POST, params="action=Run")
	public String runSQL(final Model model, @RequestParam(value="hubList",required=false,defaultValue="hello") String hubList ) {
		System.out.println(hubList);
		
		String[] hubIds = hubList.split(",");
		
		List<Hub> allHubs = new ArrayList<Hub>();
		List<Hub> selectedHubs = new ArrayList<Hub>();
		allHubs = hubService.listByIsAWS(true);
		
		for(Hub hub : allHubs) {
			if(Arrays.asList(hubIds).contains(hub.getHubName())) {
				selectedHubs.add(hub);
			}
		}
		
		System.out.println(selectedHubs);
								
		return "/hubs";
	}

}
