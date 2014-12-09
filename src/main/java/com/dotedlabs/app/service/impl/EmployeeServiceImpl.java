package com.dotedlabs.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dotedlabs.app.model.Employee;
import com.dotedlabs.app.model.EmployeeVO;
import com.dotedlabs.app.service.EmployeeService;

/**
 * 
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 *
 * EmployeeServiceImpl.java | com.dotedlabs.app.service.impl
 *
 * Dec 9, 2014 | 5:35:37 PM | 2014
 * 
 * Employee Service implementation class
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public EmployeeVO getAllEmployees() {
		EmployeeVO employeeVO = new EmployeeVO();
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("Sandeep", "sandeep@mail.com", "1222"));
		employees.add(new Employee("Rupam", "rupam@mail.com", "1333"));
		
		employeeVO.setEmployees(employees);
		return employeeVO;
	}

}