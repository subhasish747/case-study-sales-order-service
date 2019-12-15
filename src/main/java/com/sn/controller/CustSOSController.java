package com.sn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sn.dbo.CustomerSOS;
import com.sn.service.CustomerService;

@RestController
public class CustSOSController {

	
	@Autowired
	private CustomerService  customerService;
	
	
	@RequestMapping(value = "/getAllCust",method=RequestMethod.GET)
	private List<CustomerSOS> getAllCustSOS(){
		return customerService.getAllCustSOS();
	}
	
}
