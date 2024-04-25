package com.example.UserService.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserService.response.apiResponse;

@RestController
public class HomeController {

    @GetMapping
    public ResponseEntity<apiResponse> homeController(){
        apiResponse res=new apiResponse("Welcome To Task Management Microservice Project",true);
        return new ResponseEntity<apiResponse>(res,HttpStatus.ACCEPTED);
    }

    @GetMapping("/users")
    public ResponseEntity<apiResponse> userHomeController(){
        apiResponse res=new apiResponse("Welcome To Task Management User Service",true);
        return new ResponseEntity<apiResponse>(res,HttpStatus.ACCEPTED);
    }


}
