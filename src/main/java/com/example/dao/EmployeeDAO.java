package com.example.dao;

import java.util.List;

import com.example.entity.Employee;

public interface EmployeeDAO
{
    public boolean addEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public boolean deleteEmployee(Integer employeeId);
    public Employee getEmployee(Integer id);
}