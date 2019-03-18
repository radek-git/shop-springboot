package com.radek.shopspringboot.dto;

import com.radek.shopspringboot.entity.DiscountCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO implements Serializable {

    private Long id;
    private Long userId;
    private BigDecimal discount;
    private BigDecimal totalPrice;
    private Long discountCodeId;
}
