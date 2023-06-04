package com.ua.robot.robotdreamsspring.infrastructure;

import com.ua.robot.robotdreamsspring.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public List<Student> getAll() {
        return List.of(
                new Student(1l, "Name1", "Surname1"),
                new Student(2l, "Name2", "Surname2"),
                new Student(3l, "Name3", "Surname3"),
                new Student(4l, "Name4", "Surname4"),
                new Student(5l, "Name5", "Surname5"));
    }
}
