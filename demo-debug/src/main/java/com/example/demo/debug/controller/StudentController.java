package com.example.demo.debug.controller;

import com.example.demo.debug.entity.Student;
import com.example.demo.debug.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/version1/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {

        return studentService.addStudent(student);
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents() {

        return studentService.getAllStudents();
    }
    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student)
    {
        return studentService.updateStudent(student);
    }
}
