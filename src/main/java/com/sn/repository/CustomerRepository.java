package com.sn.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sn.dbo.CustomerSOS;

@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<CustomerSOS, Long> {

}
