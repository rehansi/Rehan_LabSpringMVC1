package com.greatlearning.EmployeeManagementSystem.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.EmployeeManagementSystem.model.Employee;


public interface EmployeeService {

	List<Employee> getAllEmployees();

	Employee saveEmployee(Employee emp);

	Employee getEmployeeById(long id);

	Employee updateEmployee(Employee emp);

	void deleteEmployeeById(long id);

}
