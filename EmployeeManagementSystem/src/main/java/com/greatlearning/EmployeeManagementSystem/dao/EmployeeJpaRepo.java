package com.greatlearning.EmployeeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.EmployeeManagementSystem.model.Employee;

@Repository
public interface EmployeeJpaRepo extends JpaRepository<Employee, Long>{

}
