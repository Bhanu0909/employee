package com.spring.employee.services;

import java.util.List;

import com.spring.employee.models.Employee;

public interface EmployeeService {
    
    public List<Employee> getAllEmployees();

    public Employee createEmployee(Employee employee);

    public Employee getEmployeeById(String id);

    public Employee updateEmployee(Employee employee);

    public void deleteEmployee(String id);
}
