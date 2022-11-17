package com.example.project1.repository;

import com.example.project1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // All CRUD Methods to interact with Database

}
