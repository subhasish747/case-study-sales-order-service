package com.sn.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sn.dbo.CustomerSOS;
import com.sn.repository.CustomerRepository;
import com.sn.vo.CustomerVO;

@Service
public class RecieverService {
	
	private static final Logger log = LoggerFactory.getLogger(RecieverService.class);
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@RabbitListener(queues = "customer-queue")
	public void recieveMessage(final CustomerVO message) {
		try {
			log.info("Received message as specific class: {}", message.getEmail());
			CustomerSOS sos=customerRepository.save(new CustomerSOS(message.getCustomerId(),message.getFirstName(),message.getLastName(),message.getEmail()));
			log.info("Received message saved with id: {}",sos.getId());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
