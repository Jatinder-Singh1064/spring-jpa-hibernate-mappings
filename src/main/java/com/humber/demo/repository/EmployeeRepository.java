package com.humber.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.humber.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
