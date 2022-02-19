package com.bridgrlabs.EmployPerollApp.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgrlabs.EmployPerollApp.model.EmployModel;
import com.bridgrlabs.EmployPerollApp.repository.EmployParollRepo;

@Service
public class EmployService {
	@Autowired
	EmployParollRepo repo;

	// get employee name
	public String getUserName() {
		EmployModel emp = new EmployModel();
		emp.setFirstName("mukul");
		emp.setLastName("billore");
		String name = emp.getFirstName() + " " + emp.getLastName();
		return name;
	}

	// save employee
	public void saveEmploy(EmployModel emp) {
		EmployModel employ = new EmployModel();
		employ.setDate(emp.getDate());
		employ.setDepartment(emp.getDepartment());
		employ.setFirstName(emp.getFirstName());
		employ.setLastName(emp.getLastName());
		employ.setNotes(emp.getNotes());
		employ.setSalary(emp.getSalary());
		employ.setProfilePic(emp.getProfilePic());
		repo.save(employ);
	}

	// find specific employee by id
	public Optional<EmployModel> getEmploy(Integer id) {
		Optional<EmployModel> employ = repo.findById(id);
		return employ;
	}

	// get list of all the employ
	public List<EmployModel> getAllData() {
		List<EmployModel> list = repo.findAll();
		return list;

	}

	// update specific by id
	public EmployModel updateEmploy(Integer id, EmployModel employ) {
		repo.deleteById(id);
		EmployModel emp = repo.save(employ);
		return emp;
	}

	// delete employee by id
	public String deleteEmployById(Integer id) {
		repo.deleteById(id);
		return "sucussed in deleting the employ";
	}

}
