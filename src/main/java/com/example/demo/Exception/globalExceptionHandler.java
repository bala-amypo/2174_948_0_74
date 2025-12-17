package com.example.demo.exception;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.MethodNotValidException;
@RestControllerAdvice

public class globalExceptionHandler{
    @ExceptionHandler(MethodNotValidException.class)
    public ResponseEntity

}
