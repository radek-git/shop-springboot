package com.radek.shopspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order extends AbstractEntity{

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    private BigDecimal discount;
    private BigDecimal totalPrice;

    @ManyToOne(cascade = CascadeType.ALL)
    private DiscountCode discountCode;

//    @OneToMany(mappedBy = "id.order",cascade = CascadeType.ALL)
//    private List<OrderItem> orderItems = new ArrayList<>();
}
