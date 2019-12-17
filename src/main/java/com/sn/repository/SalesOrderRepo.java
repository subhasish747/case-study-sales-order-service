package com.sn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sn.dbo.SalesOrder;

public interface SalesOrderRepo extends JpaRepository<SalesOrder, Long> {

}
