package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.UserRepository;
import com.example.demo.Services.UserService;
import com.example.demo.bean.User;
@CrossOrigin

@RestController
public class UserController {

	@Autowired
	UserService us;
		
		@RequestMapping("/users")
		public List<User>  findAll() {
			
		return  us.findAll();
		}
		@PostMapping("/saveuser")
		public void saveData( @RequestBody User input) {
			
			us.saveData(input);
			
		}

	


}
