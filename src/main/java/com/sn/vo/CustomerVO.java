package com.sn.vo;

import java.io.Serializable;

public class CustomerVO implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private long customerId;

private String firstName;

private String lastName;

private String email;

public CustomerVO(long customerId, String firstName, String lastName, String email) {
	super();
	this.customerId = customerId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
}

public CustomerVO() {
	super();
	// TODO Auto-generated constructor stub
}

public long getCustomerId() {
	return customerId;
}

public void setCustomerId(long customerId) {
	this.customerId = customerId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}



}
