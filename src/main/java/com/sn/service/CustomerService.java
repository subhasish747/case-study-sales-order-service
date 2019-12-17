package com.sn.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sn.dbo.CustomerSOS;
import com.sn.listener.RecieverService;
import com.sn.repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerService {

	private static final Logger log = LoggerFactory.getLogger(CustomerService.class);
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public void addCustSOS(CustomerSOS custSOS) {
		// TODO Auto-generated method stub
		customerRepository.save(custSOS);
	}

	@Override
	public List<CustomerSOS> getAllCustSOS() {
		log.info("getAllCustSOS--------start-------------");
		return customerRepository.findAll();
	}
	
	
	@Override
	public CustomerSOS getCustSOS(Long id) {
		log.info("getAllCustSOS--------start-------------");
		return customerRepository.findById(id).orElse(new CustomerSOS());
	}

	
	
	
	

}
