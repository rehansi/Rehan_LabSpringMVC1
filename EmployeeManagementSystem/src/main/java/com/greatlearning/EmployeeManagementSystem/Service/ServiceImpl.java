package com.greatlearning.EmployeeManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.EmployeeManagementSystem.dao.EmployeeJpaRepo;
import com.greatlearning.EmployeeManagementSystem.model.Employee;

@Service
public class ServiceImpl implements EmployeeService {

	@Autowired
	EmployeeJpaRepo employeerepo;
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return employeerepo.findAll();
	}
	
	
	public Employee saveEmployee(Employee emp) {
		return this.employeerepo.save(emp);
	}

	
	public Employee getEmployeeById(long id) {

		Optional<Employee> employeeoptional =employeerepo.findById(id);
		return employeeoptional.get();
	}

	
	

	@Override
	public Employee updateEmployee(Employee emp) {
	     return employeerepo.save(emp);
	}

	@Override
	public void deleteEmployeeById(long id) {
		employeerepo.deleteById(id);

	}

}
