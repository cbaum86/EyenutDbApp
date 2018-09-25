package com.harvardtechnology.EyenutDbApp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
	
	String pageTitle = "Hubs :: EyeNut Database App";
	
	@Autowired HubService hubService;
	@Autowired QueryService queryService;
	
	@RequestMapping("/hubs")
	public String hubList(Model model) {
		
		model.addAttribute("pageTitle", pageTitle);
		model.addAttribute("awsHubs", hubService.listByIsAWS(true));
		model.addAttribute("starHubs", hubService.listByIsAWS(false));
		
		return "/hubs";
	}
	
	@RequestMapping(value = "/results", method=RequestMethod.POST, params="action=RunQuery")
	public String runSQL(final Model model, @RequestParam(value="hubList",required=false,defaultValue="hello") String hubList ) {
		
		String[] hubIds = hubList.split(",");
		List<Hub> selectedAwsHubs = new ArrayList<Hub>();
		List<Hub> selectedStarHubs = new ArrayList<Hub>();
		
		for(String hubStr : hubIds) {
			Hub hub = hubService.findByName(hubStr);
			if (hub.isAWS()) {
				selectedAwsHubs.add(hub);
			} else if (!hub.isAWS()) {
				selectedStarHubs.add(hub);
			}
		}
		
		System.out.println(selectedAwsHubs);
		System.out.println(selectedStarHubs);
								
		return "/hubs";
	}
	
	@SuppressWarnings("unchecked")
	public void getColumnValues(Map<String, Object> results) {
		//For each Hub in a results
		for(Map.Entry<String, Object> hubResults : results.entrySet()) {
			
			//Cast the Map Object Value to List<List<Map<String, Object>>>
			List<List<Map<String,Object>>> queryValues = (List<List<Map<String, Object>>>) hubResults.getValue();
			
			for(List<Map<String, Object>> queryValue : queryValues) {
			  
				for(Map<String, Object> columnValues : queryValue) {
					
					List<String> columnHeaders = new ArrayList<String>(columnValues.keySet());
					System.out.println(columnHeaders);
					
					for(Map.Entry<String, Object> columnValue : columnValues.entrySet()) {
						
						System.out.println(columnValue.getKey() + " : " + columnValue.getValue());
						
					}
				}
			}
		}
	}

}
