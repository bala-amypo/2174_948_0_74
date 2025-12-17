package com.example.demo.Entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class studentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @NotBlank(message="Name is not valid")
    private String name;

    @Email(message="")

     
    @
}
