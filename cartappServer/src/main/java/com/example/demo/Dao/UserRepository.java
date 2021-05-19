package com.example.demo.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.bean.User;
@RestResource(path="userlist",rel= "userlist")
public interface UserRepository extends CrudRepository<User, Long> {
	

}
