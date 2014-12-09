package com.dotedlabs.app.model;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private String empName;
	private String empEmail;
	private String empSalary;

	public Employee() {
	}

	public Employee(String empName, String empEmail, String empSalary) {
		super();
		this.empName = empName;
		this.empEmail = empEmail;
		this.empSalary = empSalary;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName
	 *            the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empEmail
	 */
	public String getEmpEmail() {
		return empEmail;
	}

	/**
	 * @param empEmail
	 *            the empEmail to set
	 */
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	/**
	 * @return the empSalary
	 */
	public String getEmpSalary() {
		return empSalary;
	}

	/**
	 * @param empSalary
	 *            the empSalary to set
	 */
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}

}
