package com.example.demo.bean;


import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@Entity
public class Order {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderId;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)// @JoinColumn(name = "userId", nullable = false)
	private User user;
	private float totalAmount;
	private Date orderDate;
	@OneToMany
	private List<OrderMaster> orderMstr;
	

	public Order(User user, float total, Date orderDate) {
		super();
		this.user = user;
		this.totalAmount = total;
		this.orderDate = orderDate;
	}


	public Long getOrderId() {
		return orderId;
	}


	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public float getTotal() {
		return totalAmount;
	}


	public void setTotal(float total) {
		this.totalAmount = total;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	
}
