package com.bridgrlabs.EmployeePayrollApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgrlabs.EmployeePayrollApp.model.EmployeeModel;

public interface EmployeePayrollRepo extends JpaRepository<EmployeeModel ,Integer>{
	
}
