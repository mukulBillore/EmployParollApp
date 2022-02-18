package com.bridgrlabs.EmployPerollApp.service;

import com.bridgrlabs.EmployPerollApp.model.EmployModel;

public class EmployService {

	public EmployModel getEmploy() {
		EmployModel emp = new EmployModel();
		emp.setFirstName("mukul");
		emp.setLastName("billore");
		return emp;
	}

}
