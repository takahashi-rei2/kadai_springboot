package com.example.demo.repository.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface UserMapper {

    
    public int count();

    
    List<User> findAll();  // 修正・確認
}
