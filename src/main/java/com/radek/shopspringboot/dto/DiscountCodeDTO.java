package com.radek.shopspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiscountCodeDTO implements Serializable {

    private Long id;
    private String discountCode;
    private boolean availability;
    private BigDecimal discountAmount;
    private BigDecimal minimumTotalPrice;
}
