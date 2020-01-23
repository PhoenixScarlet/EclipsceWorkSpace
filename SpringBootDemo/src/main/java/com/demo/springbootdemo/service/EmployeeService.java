package com.demo.springbootdemo.service;

import java.util.List;

import com.demo.springbootdemo.entity.Employee;


 

public interface EmployeeService {
	
	public List<Employee> retrieveEmployees();

	public Employee getEmployee(int id);

	public void saveEmployee(Employee employee);

	public void deleteEmployee(int id);

	public void updateEmployee(Employee employee);
}
