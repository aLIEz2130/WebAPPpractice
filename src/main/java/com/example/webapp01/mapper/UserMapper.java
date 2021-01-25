package com.example.webapp01.mapper;

import com.example.webapp01.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("insert into user(username,password) value(#{username},#{password})")
    void adduser(User user);
}
