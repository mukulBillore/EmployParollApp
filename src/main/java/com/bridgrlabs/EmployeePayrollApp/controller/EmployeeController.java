package com.bridgrlabs.EmployeePayrollApp.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgrlabs.EmployeePayrollApp.dto.EmployeeDTO;
import com.bridgrlabs.EmployeePayrollApp.dto.ResponceDTO;
import com.bridgrlabs.EmployeePayrollApp.model.EmployeeModel;
import com.bridgrlabs.EmployeePayrollApp.service.EmployeeService;

import lombok.Data;

@RestController
@RequestMapping("/employParollApp")
public @Data class EmployeeController {
	@Autowired
	EmployeeService service;

	// showing hello msg generic
	@GetMapping("/")
	public String test() {
		return "hello dear ! welcome to employ paroll app ";
	}

	// showing hello msg by name of employ
	@PutMapping("/hello")
	public ResponseEntity<String> sayHelloToUserByName(@RequestParam String  fname) {
		String msg = "Hello " + service.getUserName(fname) + "  to EmployParollApp";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	// saving the employ data
	@PostMapping("/setuser")
	public ResponseEntity<String> saveUserdata(@RequestBody EmployeeModel employ) {
		service.saveEmploy(employ);
		return new ResponseEntity<String>("sucussfully saved user", HttpStatus.OK);
	// saving the employ data using DTO
	}
	@PostMapping("/saveuser")
	public ResponseEntity<String> saveUserdatabyDTO(@RequestBody EmployeeDTO employee) {
	EmployeeModel newEmployee = service.saveEmployDTO(employee);
	ResponceDTO dto = new ResponceDTO("sucussfully saved emp", newEmployee);
		return new ResponseEntity(dto, HttpStatus.OK);
	}

	
	
	// getting the employ data by id
	@GetMapping("/getuser/{id}")
	public ResponseEntity<EmployeeModel> retriveUserdataById(@PathVariable Integer id) {
		EmployeeModel emp = service.getEmploy(id);
		return new ResponseEntity<EmployeeModel>(emp, HttpStatus.OK);
	}

	// update the employ by id
	@PutMapping("/updateEmp/{id}")
	public ResponseEntity<EmployeeModel> updateUserdataById(@RequestBody EmployeeModel employ, @PathVariable Integer id) {
		return new	 ResponseEntity<EmployeeModel>(service.updateEmploy(id, employ), HttpStatus.OK);
	}

	// update the employ by id through dto layer
		@PutMapping("/empUpdate/{id}")
		public ResponseEntity<ResponceDTO> updateUserdataByIdUsingDTO(@RequestBody EmployeeDTO employeeDTO, @PathVariable Integer id) {
			EmployeeModel newEmp = service.updateUserThroughDTOByID(id ,employeeDTO);
			ResponceDTO responcedto = new ResponceDTO("updated sucussFully", newEmp); 
			return new ResponseEntity<ResponceDTO>(responcedto, HttpStatus.OK);
		}
	// ability to get all employee data which is saved in Db
	@GetMapping("/getAll")
	public ResponseEntity<List<EmployeeModel>> getAllDataFromRepo() {
		return new ResponseEntity<List<EmployeeModel>>(service.getAllData(), HttpStatus.OK);
	}

	// delete the employ by id
	@DeleteMapping("/deleteEmp/{id}")
	public ResponseEntity<String> updateUserdataById(@PathVariable Integer id) {
		service.deleteEmployById(id);
		return new ResponseEntity<String>("sucussesfully deleted the employee", HttpStatus.OK);
	}
}
