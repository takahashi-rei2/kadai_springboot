package com.example.demo.repository.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    int count();

    List<User> findAll();

    int insert(User user);

    int update(@Param("id") int id, @Param("user") User user);

    User findById(@Param("id") int id);
}
