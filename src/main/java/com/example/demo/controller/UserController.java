package com.example.demo.controller;

import com.example.demo.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.UserRepository;
import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
    private  UserRepository userRepository;

   

    // データベースから取得したユーザーリストを返すエンドポイント
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}