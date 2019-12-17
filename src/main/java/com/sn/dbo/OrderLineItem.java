package com.sn.dbo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderLineItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="item_quantity")
	private String itemQuantity;

	
	@Column(name="order_id")
	private Long orderId;




	public OrderLineItem(String itemName, String itemQuantity, Long orderId) {
		super();
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.orderId = orderId;
	}


	public OrderLineItem() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemQuantity() {
		return itemQuantity;
	}


	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}


	public Long getOrderId() {
		return orderId;
	}


	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	




}
