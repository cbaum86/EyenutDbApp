package com.harvardtechnology.EyenutDbApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.harvardtechnology.EyenutDbApp.model.Query;
import com.harvardtechnology.EyenutDbApp.repository.QueryRepository;

@Controller
@RequestMapping(path="/querys")
public class QueryController {
	
	@Autowired private QueryRepository queryRepo;
	
	@GetMapping("/listall")
	public @ResponseBody Iterable<Query> getAllQuerys() {
		return queryRepo.findAll();
	}

}
