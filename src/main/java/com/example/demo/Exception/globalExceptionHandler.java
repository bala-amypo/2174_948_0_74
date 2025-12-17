package com.example.demo.exception;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.MethodNotValidException;
@RestControllerAdvice

public class globalExceptionHandler{
    @ExceptionHandler(MethodNotValidException.class)
    public ResponseEntity<?>handleFieldError(MethodArgumentNotValidException ex){
    Map<String,String>error=new HashMap<>();
    ex.getBindingResult().getFieldsError().forEach( err->error.put(ex.getField(),ex.getDefaultMessage()))
    return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST)
}

}
