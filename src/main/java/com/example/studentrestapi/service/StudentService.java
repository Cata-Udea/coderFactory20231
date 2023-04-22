package com.example.studentrestapi.service;

import com.example.studentrestapi.model.Student;
import com.example.studentrestapi.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    private StudentService(StudentRepository studentRepository){
        this.studentRepository= studentRepository;
    }

    public List<Student> findAll(){
        var studentList = studentRepository.findAll();
        return studentList;
    }

    public Student findByName(String name){
        var student = studentRepository.findByFullNameStartingWith(name);
        return student;
    }


}
