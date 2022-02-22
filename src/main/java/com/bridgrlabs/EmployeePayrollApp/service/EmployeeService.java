package com.bridgrlabs.EmployeePayrollApp.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgrlabs.EmployeePayrollApp.dto.EmployeeDTO;
import com.bridgrlabs.EmployeePayrollApp.model.EmployeeModel;
import com.bridgrlabs.EmployeePayrollApp.repository.EmployeePayrollRepo;

@Service
public class EmployeeService {
	@Autowired
	EmployeePayrollRepo repo;

	// get employee name
	public String getUserName(String fname) {
		EmployeeModel emp = new EmployeeModel();
		emp.setFirstName(fname);
		return  emp.getFirstName();
	}

	// save employee
	public void saveEmploy(EmployeeModel emp) {
		EmployeeModel employ = new EmployeeModel(emp);

		repo.save(employ);
	}

	// find specific employee by id
	public EmployeeModel getEmploy(Integer id) {
		EmployeeModel employ = repo.findById(id).get();
		return employ;
	}

	// get list of all the employ
	public List<EmployeeModel> getAllData() {
		List<EmployeeModel> list = repo.findAll();
		return list;

	}

	// update specific by id
	public EmployeeModel updateEmploy(Integer id, EmployeeModel employee) {
		EmployeeModel emp= new EmployeeModel(id ,employee);
		repo.save(emp);
		return emp;
	}

	// delete employee by id
	public String deleteEmployById(Integer id) {
		repo.deleteById(id);
		return "sucussed in deleting the employ";
	}
	//saving the data through DTO
	public EmployeeModel saveEmployDTO(EmployeeDTO employeeDTO) {
			EmployeeModel emp = new EmployeeModel(employeeDTO);
			repo.save(emp);
		return emp;
	}

	public EmployeeModel updateUserThroughDTOByID(Integer id, EmployeeDTO employee) {
		EmployeeModel newEmp =  new EmployeeModel(id , employee);
		return newEmp;
	}

}
