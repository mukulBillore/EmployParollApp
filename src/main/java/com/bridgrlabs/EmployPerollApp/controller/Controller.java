package com.bridgrlabs.EmployPerollApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgrlabs.EmployPerollApp.model.EmployModel;
import com.bridgrlabs.EmployPerollApp.service.EmployService;

@RestController
public class Controller {
	@Autowired
	EmployService service;
	
		
	@GetMapping("/getMessage")
	public ResponseEntity<EmployModel> getMessage(@RequestParam String name){
		return new ResponseEntity<EmployModel> (service.getEmploy(),HttpStatus.OK);
	}
}
