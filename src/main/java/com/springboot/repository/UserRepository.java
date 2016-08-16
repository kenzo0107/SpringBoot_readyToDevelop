package com.springboot.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.springboot.model.User;

@Mapper
@Repository
public interface UserRepository {

	@Select("SELECT id, name, email FROM users ORDER BY id DESC")
	List<User> findAll();
	
	@Insert("INSERT INTO users (name, email, password) VALUE (#{name}, #{email}, #{password})")
    int create(User user);
	
	@Select("SELECT id, name, email FROM users WHERE id = ${_parameter} ORDER BY id DESC")
    List<User> search(String condition);
}
