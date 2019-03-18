package com.radek.shopspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDTO implements Serializable {

    private Long id;
    private Long quantity;
    private String name;
    private BigDecimal price;
    private Long categoryId;

}
