package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    // 全ユーザーを取得
    @GetMapping
    public List<User> getAllUsers() {
        return userMapper.findAll();
    }

    // 新規ユーザー追加
    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        // 新規ユーザーの作成
        user.setCreated(LocalDateTime.now());
        user.setEnabled(true);
        userMapper.insert(user);
        return "User added successfully!";
    }

    // ユーザー情報を更新
    @PutMapping("/update/{id}")
    public String updateUser(@PathVariable("id") int id, @RequestBody User user) {
        // 更新するユーザーのIDを設定
        user.setId(id);
        user.setLastLogined(LocalDateTime.now());
        userMapper.update(id, user);
        return "User updated successfully!";
    }
}
