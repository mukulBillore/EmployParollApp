package com.bridgrlabs.EmployPerollApp.model;

import java.time.LocalDate;

public class EmployModel {
	private Integer id;
	private String firstName;
	private String lastName;
	private String profilePic;
	private String department;
	private long salary;
	private LocalDate date;
	private String notes;

	
	public EmployModel(Integer id, String firstName, String lastName, String profilePic, String department, long salary,
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

	public EmployModel() {
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
