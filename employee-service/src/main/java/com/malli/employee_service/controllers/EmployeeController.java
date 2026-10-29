package com.malli.employee_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping("/{id}")
    public Map<String, Object> getEmployee(@PathVariable Long id) {
        return Map.of(
            "employeeId", id,
            "name", "John Doe",
            "departmentId", 101,
            "service", "Employee Service running on port 8081"
        );
    }
}