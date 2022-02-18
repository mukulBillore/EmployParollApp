package com.bridgrlabs.EmployPerollApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgrlabs.EmployPerollApp.model.EmployModel;
import com.bridgrlabs.EmployPerollApp.service.EmployService;

@RestController
public class Controller {
	@Autowired
	EmployService service;
 
	//showing hello msg
	@GetMapping("/")
	public String test() {
		return "hello dear ! welcome to employ paroll app ";
	}
	//showing hello msg by name
	@PutMapping("/hello")
	public ResponseEntity<String> sayHelloToUserOFWithName(@RequestParam int id) {
		String msg = "Hello " + service.getUserName() + "  to EmployParollApp";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	//saving the employ data 
	@PostMapping("/setuser")
	public ResponseEntity<String> saveUserdata(@RequestBody EmployModel employ ) {
		service.saveEmploy(employ);
		return new ResponseEntity<String>("sucussfully saved user", HttpStatus.OK);
	}
	
	//getting the employ data
	@GetMapping("/getuser/{id}")
	public ResponseEntity<EmployModel> retriveUserdata(@PathVariable Integer id ) {
		EmployModel emp = service.getEmploy(id);
		return new ResponseEntity<EmployModel>(emp, HttpStatus.OK);
	}
	
//update the employ by id
	
//delete the employ by id
}
