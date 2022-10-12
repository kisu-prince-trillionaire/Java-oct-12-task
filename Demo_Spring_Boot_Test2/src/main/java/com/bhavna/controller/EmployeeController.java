package com.bhavna.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.bean.Employee;
import com.bhavna.dao.EmployeeDao;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeDao empDao;
	
	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
	public Employee getEmployee() {
		Employee emp = empDao.getEmployee();
		return emp;
	}
	
	@RequestMapping(value = "/getAllEmployee", method = RequestMethod.GET)
	public List<Employee> getAllEmployee() {
		List<Employee> list = empDao.getAllEmployee();
		return list;
	}

	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public String display() {
		String message = empDao.display();
		return "message";
	}

	@GetMapping
	public String getDisplay() {
		return "From Get Display";
	}
	
	@GetMapping("/getdisplay")
	public String testdisplay() {
		return "From test display";
	}
}
