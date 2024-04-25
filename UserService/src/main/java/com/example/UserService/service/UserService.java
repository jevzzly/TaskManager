package com.example.UserService.service;
import com.example.UserService.usermodel.User;
import com.example.UserService.exception.UserException;
import java.util.List;

    public interface UserService {


        public List<User> getAllUser() throws UserException;

        public User findUserProfileByJwt(String jwt) throws UserException;

        public User findUserByEmail(String email) throws UserException;

        public User findUserById(String userId) throws UserException;

        public List<User> findAllUsers();


    }

