package com.sn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sn.dbo.OrderLineItem;

public interface OrderLineRpo extends JpaRepository<OrderLineItem, Long> {

}
