package com.bridgrlabs.EmployeePayrollApp.dto;

import com.bridgrlabs.EmployeePayrollApp.model.EmployeeModel;

public class ResponceDTO {
	private String msg;
	private Object data;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public ResponceDTO(String msg, Object data) {
		super();
		this.msg = msg;
		this.data = data;
	}





	


}
