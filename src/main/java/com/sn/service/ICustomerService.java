package com.sn.service;

import java.util.List;

import com.sn.dbo.CustomerSOS;

public interface ICustomerService {
	
	public void addCustSOS(CustomerSOS custSOS) ;
	
	public List<CustomerSOS> getAllCustSOS() ;
	
	public CustomerSOS getCustSOS(Long id);

}
