package com.radek.shopspringboot.controller;

import com.radek.shopspringboot.dto.UserDTO;
import com.radek.shopspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<UserDTO> findAll() {
        return userService.findAll();
    }

    @PatchMapping("/{id}")
    public UserDTO updateUserById (@PathVariable Long id, @RequestBody UserDTO userDTO){
        return userService.updateUserById(userDTO, id);
    }

}
