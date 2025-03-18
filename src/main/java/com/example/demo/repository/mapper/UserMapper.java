package com.example.demo.repository.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int count();
    
}