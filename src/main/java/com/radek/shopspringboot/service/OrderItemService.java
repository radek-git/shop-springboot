package com.radek.shopspringboot.service;

import com.radek.shopspringboot.repository.OrderItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemService {

    private OrderItemRepo orderItemRepo;

    @Autowired
    public OrderItemService(OrderItemRepo orderItemRepo) {
        this.orderItemRepo = orderItemRepo;
    }
}
