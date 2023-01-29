package com.spring.employee.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.employee.models.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String>{
    
}
