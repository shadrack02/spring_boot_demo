package com.yunzu.sprdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {



    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                    firstname:"ali",
                    lastname:"boali",
                    LocalDate.now(),
                    email:"shadrackyunzu@gmail.com",
                    age:34
                ),
        new Student(
                firstname:"jhb",
                lastname:"boali",
                LocalDate.now(),
                email:"allyyunzu@gmail.com",
                age: 34
            )
        );
    }
}
