package com.demo.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springbootdemo.entity.Employee;
 

 
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
 
}