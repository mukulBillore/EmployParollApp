package com.bridgrlabs.EmployPerollApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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

	// showing hello msg generic
	@GetMapping("/employParollApp")
	public String test() {
		return "hello dear ! welcome to employ paroll app ";
	}

	// showing hello msg by name of employ
	@PutMapping("/hello")
	public ResponseEntity<String> sayHelloToUserByName(@RequestParam int id) {
		String msg = "Hello " + service.getUserName() + "  to EmployParollApp";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	// saving the employ data
	@PostMapping("/employParollApp/setuser")
	public ResponseEntity<String> saveUserdata(@RequestBody EmployModel employ) {
		service.saveEmploy(employ);
		return new ResponseEntity<String>("sucussfully saved user", HttpStatus.OK);
	}

	// getting the employ data by id
	@GetMapping("/employParollApp/getuser/{id}")
	public ResponseEntity<Optional<EmployModel>> retriveUserdataById(@PathVariable Integer id) {
		Optional<EmployModel> emp = service.getEmploy(id);
		return new ResponseEntity<Optional<EmployModel>>(emp, HttpStatus.OK);
	}

	// update the employ by id
	@PutMapping("/employParollApp/updateEmp/{id}")
	public ResponseEntity<EmployModel> updateUserdataById(@RequestBody EmployModel employ, @PathVariable Integer id) {
		return new ResponseEntity<EmployModel>(service.updateEmploy(id, employ), HttpStatus.OK);
	}

	// ability to get all employee data which is saved in Db
	@GetMapping("/employParollApp/getAll")
	public ResponseEntity<List<EmployModel>> getAllDataFromRepo() {
		return new ResponseEntity<List<EmployModel>>(service.getAllData(), HttpStatus.OK);
	}

	// delete the employ by id
	@DeleteMapping("/employParollApp/deleteEmp/{id}")
	public ResponseEntity<String> updateUserdataById(@PathVariable Integer id) {
		service.deleteEmployById(id);
		return new ResponseEntity<String>("sucussesfully deleted the employ", HttpStatus.OK);
	}
}
