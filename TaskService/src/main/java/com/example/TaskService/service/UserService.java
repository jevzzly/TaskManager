package com.example.TaskService.service;


import org.springframework.cloud.openfeign.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.TaskService.taskModel.UserDTO;

//connect with taskUserService microService
@FeignClient(name = "USER-SERVICE",url = "http://localhost:8081")
public interface UserService {

    @GetMapping("/api/users/profile")
    public UserDTO getUserProfileHandler(@RequestHeader("Authorization") String jwt);
}

