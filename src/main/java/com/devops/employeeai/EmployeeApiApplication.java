package com.devops.employeeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class EmployeeApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeApiApplication.class, args);
    }

    @GetMapping("/api/employees")
    public List<String> getEmployees() {
        return List.of(
                "Arjun - Software Engineer",
                "Priya - DevOps Engineer",
                "Rahul - QA Engineer"
        );
    }

    @GetMapping("/api/employees/{id}")
    public String getEmployee(@PathVariable int id) {
        return switch (id) {
            case 1 -> "Arjun - Software Engineer";
            case 2 -> "Priya - DevOps Engineer";
            case 3 -> "Rahul - QA Engineer";
            default -> "Employee not found";
        };
    }
}
