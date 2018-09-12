package com.harvardtechnology.EyenutDbApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.harvardtechnology.EyenutDbApp.model.Hub;
import com.harvardtechnology.EyenutDbApp.repository.HubRepository;

@Controller
@RequestMapping(path="/hubs")
public class HubController {
	
	@Autowired private HubRepository hubRepo;
	
	@GetMapping("/listall")
	public @ResponseBody Iterable<Hub> getAllHubs() {
		return hubRepo.findAll();
	}

}
