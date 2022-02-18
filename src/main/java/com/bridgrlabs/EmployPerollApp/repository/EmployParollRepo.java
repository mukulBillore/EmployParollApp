package com.bridgrlabs.EmployPerollApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgrlabs.EmployPerollApp.model.EmployModel;

public interface EmployParollRepo extends JpaRepository<EmployModel ,Integer>{
	
}
