package com.sn.dbo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Customer_SOS")
public class CustomerSOS {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@Column(name="cust_id")
	private Long custId;
	
	@Column(name="cust_first_name",length = 250)
	private String firstName;
	
	@Column(name="cust_last_name",length = 200)
	private String lastName;
	
	@Column(name="cust_email",length = 40)
	private String email;

	
	

	public CustomerSOS(Long custId, String firstName, String lastName, String email) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	

	public CustomerSOS() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}
	
	
	
	
	
	

}
