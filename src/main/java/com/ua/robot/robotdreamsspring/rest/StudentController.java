package com.ua.robot.robotdreamsspring.rest;

import com.ua.robot.robotdreamsspring.domain.Student;
import com.ua.robot.robotdreamsspring.infrastructure.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAll() {
        return studentService.getAll();
    }
}
