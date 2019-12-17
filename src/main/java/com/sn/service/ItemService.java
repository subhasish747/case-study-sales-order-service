package com.sn.service;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sn.vo.ItemVO;

@RibbonClient(name="249071-item-service")
public interface ItemService {
	
	 
	@RequestMapping(value="/service2/items/{itemname}" , method=RequestMethod.GET)
	public List<ItemVO> getItems(@PathVariable String itemname);

}
