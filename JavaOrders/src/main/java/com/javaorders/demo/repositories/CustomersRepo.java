package com.javaorders.demo.repositories;

import com.javaorders.demo.models.Customers;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomersRepo extends CrudRepository<Customers, Long> {
    List<Customers> findByCustnameContainingIgnoreCase(String likename);
}
