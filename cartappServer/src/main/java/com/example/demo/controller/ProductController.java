package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Services.ProductService;
import com.example.demo.Services.UserService;
import com.example.demo.bean.Product;
import com.example.demo.bean.User;

public class ProductController {
	@Autowired
	ProductService ps;
	
	@RequestMapping("/products")
	public List<Product>  findAll() {
	return  ps.findAll();
	}

}
