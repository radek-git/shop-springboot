package com.radek.shopspringboot.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    private Order order;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    private Item item;

    private int quantity;

    private BigDecimal price;

    private int itemPosition;

   

  

}
