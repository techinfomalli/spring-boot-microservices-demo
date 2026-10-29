package com.malli.department_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @GetMapping("/{id}")
    public Map<String, Object> getDepartment(@PathVariable Long id) {
        return Map.of(
            "departmentId", id,
            "departmentName", "Engineering",
            "service", "Department Service running on port 8082"
        );
    }
}