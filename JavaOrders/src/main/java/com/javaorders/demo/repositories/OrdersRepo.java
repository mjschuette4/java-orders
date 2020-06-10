package com.javaorders.demo.repositories;

import com.javaorders.demo.models.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepo extends CrudRepository<Orders, Long> {

}
