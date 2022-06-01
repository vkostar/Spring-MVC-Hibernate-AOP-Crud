package com.kostar.spring.hibernate.aop.controller;

import com.kostar.spring.hibernate.aop.dao.EmployeeDao;
import com.kostar.spring.hibernate.aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployees = employeeDao.getAllEmployees();
        model.addAttribute("allAmps",allEmployees);
        return "all-employees";
    }
    @RequestMapping("/start")
    public String showStart() {

        return "start";
    }
}
