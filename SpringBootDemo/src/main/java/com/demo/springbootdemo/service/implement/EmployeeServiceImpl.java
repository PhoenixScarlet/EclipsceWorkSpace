package com.demo.springbootdemo.service.implement;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springbootdemo.entity.Employee;
import com.demo.springbootdemo.repository.EmployeeRepository;
import com.demo.springbootdemo.service.EmployeeService;

 

@Service
public class EmployeeServiceImpl implements EmployeeService{
 
 @Autowired
 private EmployeeRepository employeeRepository;
 
 public void setEmployeeRepository(EmployeeRepository employeeRepository) {
  this.employeeRepository = employeeRepository;
 }

@Override
public List<Employee> retrieveEmployees() {
	List<Employee> employees = employeeRepository.findAll();
	  return employees;
}

@Override
public Employee getEmployee(int id) {
	Optional<Employee> optEmp = employeeRepository.findById(id);
	  return optEmp.get();
}

@Override
public void saveEmployee(Employee employee) {
	employeeRepository.save(employee);	
}

@Override
public void deleteEmployee(int id) {
	employeeRepository.deleteById(id);
}

@Override
public void updateEmployee(Employee employee) {
	employeeRepository.save(employee);
}



}