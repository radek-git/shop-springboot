package com.radek.shopspringboot.dto;

import com.radek.shopspringboot.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements Serializable {

    private Long id;
    private String name;
    private String surname;
    private List<OrderDTO> orders = new ArrayList<>();
}
