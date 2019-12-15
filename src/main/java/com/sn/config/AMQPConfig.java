package com.sn.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AMQPConfig {
	
	@Value("${customer.rabbitmq.exchange}")
	private String exchangeName;
	
	@Value("${customer.rabbitmq.queue}")
	private String queueName;
	
	@Value("${customer.rabbitmq.routingkey}")
	private String routingkey;
	
	
	@Bean
	Queue queue() {
		return new Queue(queueName);
	}

	@Bean
	DirectExchange exchange() {
		return new DirectExchange(exchangeName);
	}

	@Bean
	Binding binding(Queue queue,DirectExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(routingkey);
	}
	
	@Bean
	MessageConverter jsonMessageConverter() {
		return new Jackson2JsonMessageConverter();
	}
	
//    @Bean
//    MessageListenerAdapter listenerAdapter(RabbitMqListener listener) {
//        return new MessageListenerAdapter(listener, "listen");
//    }
	

}
