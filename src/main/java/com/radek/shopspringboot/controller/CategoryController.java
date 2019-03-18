package com.radek.shopspringboot.controller;

import com.radek.shopspringboot.dto.CategoryDTO;
import com.radek.shopspringboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/all")
    public List<CategoryDTO> findAll() {
        return categoryService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteCategoryById(@PathVariable Long id) {
        categoryService.deleteById(id);
    }

    @GetMapping("/{letter}")
    public List<CategoryDTO> findByFirstLetter(Character letter) {
        return categoryService.findAllByFirstLetter(letter);
    }

}
