/**
 * 
 */
package com.dotedlabs.app.model;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 *
 * EmployeeListVO.java | com.dotedlabs.app.model
 *
 * Dec 10, 2014 | 2:04:10 PM | 2014
 * 
 * This VO Contains the list of all employees
 *
 */
public class EmployeeListVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Employee> employees;
	/**
	 * @return the employees
	 */
	public List<Employee> getEmployees() {
		return employees;
	}
	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
}
