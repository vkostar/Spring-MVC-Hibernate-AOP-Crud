package com.kostar.spring.hibernate.aop.dao;

import com.kostar.spring.hibernate.aop.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> getAllEmployees();

}
