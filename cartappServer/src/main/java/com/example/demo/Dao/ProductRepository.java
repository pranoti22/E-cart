package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.bean.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product>findAll();

}
