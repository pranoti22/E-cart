package com.example.demo.Services;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.UserRepository;
import com.example.demo.bean.User;


@Service  //same as creating a bean
public class UserService {
	@Autowired
	UserRepository userrep;
	
	
	@PostConstruct
	public void init()
	{
		
	}


	public List<User> findAll() {
		
		return (List<User>) userrep.findAll();
		
	}


	public void saveData( User input) {
		userrep.save(new User(input.getFullName(),input.getEmail(),input.getMobNo(),input.getAddress(),input.getUserName(),input.getPaswrd()));
		
	}
}