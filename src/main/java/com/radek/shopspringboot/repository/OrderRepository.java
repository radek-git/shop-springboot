package com.radek.shopspringboot.repository;

import com.radek.shopspringboot.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAllByTotalPriceLessThan(BigDecimal totalPrice);
}
