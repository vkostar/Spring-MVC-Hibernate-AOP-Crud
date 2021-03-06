package com.kostar.spring.hibernate.aop.dao;

import com.kostar.spring.hibernate.aop.entity.Employee;
import org.hibernate.Session;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    public void deleteEmployee(int id);

}

