package com.javaorders.demo.repositories;

import com.javaorders.demo.models.Customers;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CustomersRepo extends CrudRepository<Customers, Long> {
}
