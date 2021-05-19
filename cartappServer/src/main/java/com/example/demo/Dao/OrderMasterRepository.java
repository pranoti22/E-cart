package com.example.demo.Dao;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.bean.OrderMaster;

public interface OrderMasterRepository extends CrudRepository<OrderMaster, Long> {

}
