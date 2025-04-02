package com.example.demo.repository;

import com.example.demo.model.User;
import com.example.demo.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private UserMapper userMapper;

    // 全ユーザーを取得
    public List<User> findAll() {
        return userMapper.findAll();
    }

    // ID でユーザーを取得
    public User findById(int id) {
        return userMapper.findById(id);
    }

    // ユーザーを新規追加
    public void insert(User user) {
        userMapper.insert(user);
    }

    // ユーザー情報を更新
    public void update(User user) {
        userMapper.update(0, user);
    }
}
