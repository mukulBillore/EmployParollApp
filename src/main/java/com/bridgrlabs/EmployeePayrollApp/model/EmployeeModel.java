package com.bridgrlabs.EmployeePayrollApp.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String firstName;
	private String lastName;
	private String profilePic;
	private String department;
	private long salary;
	private LocalDate date;
	private String notes;

	
	public EmployeeModel(Integer id, String firstName, String lastName, String profilePic, String department, long salary,
			LocalDate date, String notes) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profilePic = profilePic;
		this.department = department;
		this.salary = salary;
		this.date = date;
		this.notes = notes;
	}

	public EmployeeModel() {
	}

	
	public EmployeeModel(EmployeeModel emp) {
		this.id = emp.id;
		this.firstName = emp.firstName;
		this.lastName = emp.lastName;
		this.profilePic = emp.profilePic;
		this.department = emp.department;
		this.salary = emp.salary;
		this.date = emp.date;
		this.notes = emp.notes;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getNotes() {
		return notes;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
