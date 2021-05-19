package com.example.demo.bean;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@Entity
public class OrderMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderMstrId;
	//@ManyToOne(fetch = FetchType.LAZY, optional = false)
    //@JoinColumn(name = "orderId", nullable = false)
	//private Order order;
	private int qty;
	private float amount;
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "prodId", nullable = false)
	private Product product;
	
	
	public OrderMaster( int qty, float amount, Product product) {
		super();
		//this.order = order;
		this.qty = qty;
		this.amount = amount;
		this.product = product;
	}
	
	public Long getOrderMstrId() {
		return orderMstrId;
	}
	public void setOrderMstrId(Long orderMstrId) {
		this.orderMstrId = orderMstrId;
	}
	/*public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}*/
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
}
