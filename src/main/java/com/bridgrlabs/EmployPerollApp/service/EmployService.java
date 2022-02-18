package com.bridgrlabs.EmployPerollApp.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.bridgrlabs.EmployPerollApp.model.EmployModel;

@Service
public class EmployService {
	public String  getUserName() {
		EmployModel emp = new EmployModel();
		emp.setFirstName("mukul");
		emp.setLastName("billore");
		String name = emp.getFirstName()+" "+emp.getLastName();
		return name;
	}
	
	public EmployModel saveEmploy(EmployModel emp) {
		EmployModel employ = new EmployModel();
		employ.setDate(emp.getDate());
		employ.setDepartment(emp.getDepartment());
		employ.setFirstName(emp.getFirstName());
		employ.setLastName(emp.getLastName());
		employ.setNotes(emp.getNotes());
		employ.setSalary(emp.getSalary());
		employ.setProfilePic(emp.getProfilePic());
		return employ;
		
	}
	public EmployModel getEmploy(int id) {
		EmployModel employ = new EmployModel();
		employ.setDate( LocalDate.parse("2018-11-01"));
		employ.setDepartment("developer");
		employ.setFirstName("mukul");
		employ.setLastName("Billore");
		employ.setNotes("this is the node field");
		employ.setSalary(400000);
		employ.setProfilePic("xyzap.jpeg");
		employ.setId(id);
		return employ;
	}

}
