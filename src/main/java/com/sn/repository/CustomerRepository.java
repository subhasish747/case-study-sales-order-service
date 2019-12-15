package com.sn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sn.dbo.CustomerSOS;

public interface CustomerRepository extends JpaRepository<CustomerSOS, Long> {

}
