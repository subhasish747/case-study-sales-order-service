package com.sn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sn.dbo.CustomerSOS;
import com.sn.dbo.OrderLineItem;
import com.sn.dbo.SalesOrder;
import com.sn.repository.OrderLineRpo;
import com.sn.repository.SalesOrderRepo;
import com.sn.service.ICustomerService;
import com.sn.service.ItemService;
import com.sn.vo.ItemVO;
import com.sn.vo.OrderDetailsVO;

@RestController
@RequestMapping(name = "/service3")
public class CustSOSController {

	@Autowired
	private ICustomerService customerService;

	@Autowired
	private SalesOrderRepo salesOrderRepo;
	
	
	@Autowired
	private OrderLineRpo orderLineRpo;


	@Autowired
	private ItemService itemService;

	@RequestMapping(value = "/getAllCust", method = RequestMethod.GET)
	private List<CustomerSOS> getAllCustSOS() {
		return customerService.getAllCustSOS();
	}

	@RequestMapping(value = "/orders", method = RequestMethod.POST)
	private String addOrder(OrderDetailsVO order) {
		CustomerSOS custSOS = customerService.getCustSOS(order.getCustId());
		SalesOrder salesOrder = null;

		if (custSOS.getCustId() > 0) {
			salesOrder = new SalesOrder(order.getOrderDate(), order.getCustId(), order.getOrderDesc(), 0l);
			for (String item : order.getItems()) {
				ItemVO itemVO = itemService.getItems(item).get(0);
				salesOrder.setTotalPrice(salesOrder.getTotalPrice() + itemVO.getPrice());
				salesOrder=salesOrderRepo.save(salesOrder);
				orderLineRpo.save(new OrderLineItem(itemVO.getName(),"1",salesOrder.getId()));
			}
			
			return "Order created";

		}
		return "Order Not created";

		
		
	}

}
