package com.radek.shopspringboot.service;

import com.radek.shopspringboot.dto.OrderDTO;
import com.radek.shopspringboot.dto.UserDTO;
import com.radek.shopspringboot.entity.Order;
import com.radek.shopspringboot.entity.User;
import com.radek.shopspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO convertUserToDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getName(),
                user.getSurname(),
                convertOrderListToDTO(user.getOrders())
        );
    }

    public List<UserDTO> convertUserListToDTO(List<User> users) {
        return users.stream().map(this::convertUserToDTO).collect(Collectors.toList());
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

    public List<UserDTO> findAll () {
        return convertUserListToDTO(userRepository.findAll());
    }

    public UserDTO findById(Long id) {
        return convertUserToDTO(userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("nie ma takiego użytkownika")));
    }

    public List<UserDTO> findUserByName(String name) {
        return convertUserListToDTO(userRepository.findAllByName(name));
    }

    public UserDTO updateUserById(UserDTO userDTO, Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Nie ma takiego użytkownika"));

        if (userDTO.getName() != null) {
            user.setName(userDTO.getName());
        }

        if (userDTO.getSurname() != null) {
            user.setSurname(userDTO.getSurname());
        }

        userRepository.save(user);
        return convertUserToDTO(user);
    }



}
