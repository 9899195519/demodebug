package com.example.demo.debug.service;

import com.example.demo.debug.entity.Student;
import com.example.demo.debug.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public Student addStudent(Student student)
    {

        return studentRepository.save(student);
    }

    public List<Student> getAllStudents()
    {
        return studentRepository.findAll();
    }
    public Student updateStudent(Student student) {
        Student studentObj = studentRepository.findById(student.getId())
                .orElseThrow(() -> new RuntimeException("Student not found"+student.getId()));
           studentObj.setFirstName(student.getFirstName());
            studentObj.setLastName(student.getLastName());
            studentObj.setAge(student.getAge());
            studentRepository.save(studentObj);
            return studentObj;
        }

}
