package com.example.studentrestapi.controller;

import com.example.studentrestapi.model.Student;
import com.example.studentrestapi.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Student>> finAll(){
        var studentList = studentService.findAll();
        return ResponseEntity.ok(studentList);

    }

    @GetMapping("/listarpornombre") //"/listarpornombre/{name}" con @PathVariable, el request param la url pongo ? para los params
    public ResponseEntity<Student> finByName(@RequestParam String name){
        var student = studentService.findByName(name);
        return ResponseEntity.ok(student);

    }


}
