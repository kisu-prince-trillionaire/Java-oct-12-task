package com.bhavna.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bhavna.bean.Employee;

@Repository
public class EmployeeDao {
	public String display() {
		return "Message from dao";
	}
	
	public Employee getEmployee() {
		Employee emp = new Employee(101,"Ram",40400);
		return emp;
	}
	
	public List<Employee> getAllEmployee() {
		Employee emp1 = new Employee(101,"Ram",40400);
		Employee emp2 = new Employee(102,"Jam",40400);
		Employee emp3 = new Employee(103,"Kam",40400);
		Employee emp4 = new Employee(104,"Sam",40400);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		return list;

	}
}
