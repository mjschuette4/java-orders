package com.javaorders.demo.services;

import com.javaorders.demo.models.Orders;
import com.javaorders.demo.repositories.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service(value = "ordersService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrdersRepo ordersrepos;

    @Override
    public Orders findOrdersById(long id)
    {
        return ordersrepos.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Order " + id + " Not found"));
    }
}
