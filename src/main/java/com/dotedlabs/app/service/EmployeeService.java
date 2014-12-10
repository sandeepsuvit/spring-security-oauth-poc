package com.dotedlabs.app.service;

import com.dotedlabs.app.model.EmployeeListVO;

/**
 * 
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 *
 * EmployeeService.java | com.dotedlabs.app.service
 *
 * Dec 9, 2014 | 5:35:56 PM | 2014
 * 
 * Interface to define emplpoyee services
 */
public interface EmployeeService {

	/**
	 * Method to get the list of all services
	 * 
	 * @return
	 */
	public EmployeeListVO getAllEmployees();
}
