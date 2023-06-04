package com.ua.robot.robotdreamsspring.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Student {
    private Long id;
    private String firstName;
    private String lastName;
}
