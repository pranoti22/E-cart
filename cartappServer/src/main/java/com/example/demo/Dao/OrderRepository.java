package com.example.demo.Dao;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.bean.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
