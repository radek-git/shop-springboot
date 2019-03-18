package com.radek.shopspringboot.service;

import com.radek.shopspringboot.dto.OrderDTO;
import com.radek.shopspringboot.entity.Order;
import com.radek.shopspringboot.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    public List<OrderDTO> convertOrderListToDTO(List<Order> orders) {
        return orders.stream().map(this::convertOrderToDTO).collect(Collectors.toList());
    }

    public OrderDTO convertOrderToDTO(Order order) {
        return new OrderDTO(
                order.getId(),
                order.getUser().getId(),
                order.getDiscount(),
                order.getTotalPrice(),
                order.getDiscountCode().getId()
        );
    }
}
