package com.example.employeeservice;

import com.example.employeeservice.entity.Employee;
import com.example.employeeservice.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public String getEmployee() {
        return new Employee().toString();
    }

    //TEST Code to persist instead of using postman or swagger
    @GetMapping("/employee/{name}")
    public String addEmployee(@PathVariable String name) {
        Employee employee = new Employee();
        employee.setName(name);
        return employeeService.save(employee).toString();
    }
}
