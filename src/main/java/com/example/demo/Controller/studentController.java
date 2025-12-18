package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/getAllStudent")
    public List<StudentEntity> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public StudentEntity addStudent(@Valid @RequestBody StudentEntity student) {
        return service.addStudent(student);
    }
}
