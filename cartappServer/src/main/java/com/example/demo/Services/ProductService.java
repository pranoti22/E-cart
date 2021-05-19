package com.example.demo.Services;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.ProductRepository;
import com.example.demo.Dao.UserRepository;
import com.example.demo.bean.Product;
import com.example.demo.bean.User;
@Service
public class ProductService {
	@Autowired
	ProductRepository prodrep;
	
	
	@PostConstruct
	public void init()
	{
		
	}


	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return prodrep.findAll();
	}

}
