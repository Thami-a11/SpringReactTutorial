package com.tutorial.FullstackTuorial.Controller;

import com.tutorial.FullstackTuorial.Model.Student.Gender;
import com.tutorial.FullstackTuorial.Model.Student.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/Student")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents(){
        List<Student> students = Arrays.asList(
                new Student(1L, "Tamila", "Tamila@amgoscode.edu", Gender.Female)
        );
        return students;
    }
}
