package com.dotedlabs.app.model;

import java.io.Serializable;
import java.util.List;

public class EmployeeVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Employee> employees;

	/**
	 * @return the employees
	 */
	public List<Employee> getEmployees() {
		return employees;
	}

	/**
	 * @param employees
	 *            the employees to set
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
