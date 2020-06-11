package com.javaorders.demo.services;

import com.javaorders.demo.models.Orders;

public interface OrderService {
    Orders findOrdersById(long id);
}
