package com.jx.restapiexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jx.restapiexample.domain.SalesCustomer;

public interface SalesCustomerRepository extends JpaRepository<SalesCustomer, Long>{

}
