package com.demo.springbootdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springbootdemo.entity.Employee;
import com.demo.springbootdemo.service.EmployeeService;



@RestController 
public class EmployeeRestController {
	@Autowired
	EmployeeService employeeService;
	
	 public void setEmployeeService(EmployeeService employeeService) {
		  this.employeeService = employeeService;
		 }

	
	@GetMapping(path="/employee")
	public List<Employee> getEmployee() {
		List<Employee> employees = employeeService.retrieveEmployees();
		  return employees;
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id") int id)//Optional- Returns Alien object if present else returns Optional data
	{
		return employeeService.getEmployee(id);
	}
	
	@PostMapping(path="/employee",consumes= {"application/json"})
	public String addEmployee(@RequestBody Employee employee)
	{
		employeeService.saveEmployee(employee);
		return "Employee Saved Successfully";
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		return "record deleted";
	}
	
	@PutMapping(path="/employee/{id}",consumes= {"application/json"})
	public String saveOrUpdateEmployee(@RequestBody Employee employee,
			@PathVariable("id")Integer id) {
		Employee emp = employeeService.getEmployee(id);
		  if(emp != null){
		   employeeService.updateEmployee(employee);
		  }
		  return "Record Updated Successfully!!";
	}
}
