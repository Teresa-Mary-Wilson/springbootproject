package com.example.springbootproject.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@SpringBootApplication
@RestController
@RequestMapping("/api/message")

public class TestController {
    
    @GetMapping("/hello")
    public ResponseEntity<String> get(){
        return ResponseEntity.ok("Hello all");
    }
    @GetMapping("/hi")
    public ResponseEntity<String> get1(){
        return ResponseEntity.ok("Hi everyone");
    }
   
    
    
}
