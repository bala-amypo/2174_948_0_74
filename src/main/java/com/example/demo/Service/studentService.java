package com.example.demo.service.impl;
import com.example.demo.service.*;
import com.example.demo.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
@Service
public class studentServiceimpl implements studentService{
    @Autowired
    studentRepo repo;

    public List<studentEntity>getAll(){
        return repo.findAll();
    }
}