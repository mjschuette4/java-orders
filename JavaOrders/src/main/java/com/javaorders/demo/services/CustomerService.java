package com.javaorders.demo.services;

import com.javaorders.demo.models.Customers;

import java.util.List;

public interface CustomerService {
    List<Customers> findAllCustomers();

    Customers findCustomerById(long id);

    List<Customers> findByNameLike(String cname);
}
