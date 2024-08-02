package com.yunzu.sprdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
                new Student("ali", "boali", "shadrackyunzu@gmail.com", 34, LocalDate.now()),
                new Student("jhb", "boali", "allyyunzu@gmail.com", 34, LocalDate.now())
        );
    }
}
