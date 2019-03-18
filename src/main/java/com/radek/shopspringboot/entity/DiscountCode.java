package com.radek.shopspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiscountCode extends AbstractEntity{

    private String discountCode;
    private boolean availability;
    private BigDecimal discountAmount;
    private BigDecimal minimumTotalPrice;

}
