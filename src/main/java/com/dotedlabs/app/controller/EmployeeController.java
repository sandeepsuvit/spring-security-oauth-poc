package com.dotedlabs.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dotedlabs.app.model.EmployeeListVO;
import com.dotedlabs.app.service.EmployeeService;
/**
 * 
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 *
 * EmployeeController.java | com.dotedlabs.app.controller
 *
 * Dec 9, 2014 | 5:35:11 PM | 2014
 *
 * Employee Controller class
 */
@Controller
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/getListOfEmployees", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	ResponseEntity<EmployeeListVO> getAllContacts() {
		return new ResponseEntity<EmployeeListVO>(
				employeeService.getAllEmployees(), HttpStatus.OK);
	}
}
