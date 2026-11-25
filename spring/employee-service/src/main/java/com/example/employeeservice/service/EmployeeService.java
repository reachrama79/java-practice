package com.example.employeeservice.service;

import com.example.employeeservice.entity.Employee;
import com.example.employeeservice.repository.EmployeeRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends GenericServiceImpl<Employee, Long> {

    public EmployeeService(EmployeeRepository repository) {
        super(repository);
    }
}
