package com.example.demo.debug.service;

import com.example.demo.debug.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class StudentService {
    List<Student> studentList=new ArrayList<>();;
    public Student addStudent(Student student)
    {
        studentList.add(student);
        return student;
    }

    public List<Student> getAllStudents()
    {
        return studentList;
    }
    public Student updateStudent(int id,Student student)
    {
        Student studentObj=studentList.stream().filter(s->s.getId()==id).findFirst().orElse(null);
        if(studentObj!=null && studentObj.getId()>0){
            studentObj.setFirstName(student.getFirstName());
            studentObj.setLastName(student.getLastName());
            studentObj.setAge(student.getAge());
        }
        return studentObj;
    }
}
