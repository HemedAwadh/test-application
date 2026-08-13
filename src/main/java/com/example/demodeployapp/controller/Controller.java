package com.example.demodeployapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/v1")

public class Controller {

    String message = "Hello, this is my first Deployed Application";

    @PostMapping("/hello")
    public ResponseEntity<?> hello(){
        return new ResponseEntity<>(Map.of("message",message),HttpStatus.OK);
    }
}
