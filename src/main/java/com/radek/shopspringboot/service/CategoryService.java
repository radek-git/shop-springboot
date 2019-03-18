package com.radek.shopspringboot.service;


import com.radek.shopspringboot.dto.CategoryDTO;
import com.radek.shopspringboot.entity.Category;
import com.radek.shopspringboot.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public CategoryDTO convertCategoryToDTO(Category category) {
        return new CategoryDTO(
                category.getId(),
                category.getName()
        );
    }

    public List<CategoryDTO> convertCategoryListToDTO(List<Category> categories) {
        return categories.stream().map(this::convertCategoryToDTO).collect(Collectors.toList());
    }

    public List<CategoryDTO> findAll() {
        return convertCategoryListToDTO(categoryRepository.findAll());
    }

    public List<CategoryDTO> finadByName(String name) {
        return convertCategoryListToDTO(categoryRepository.findByName(name));
    }

    public CategoryDTO findById(Long id) {
        return convertCategoryToDTO(categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("nie ma takiej kategorii")));
    }

    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }

    public List<CategoryDTO> findAllByFirstLetter(Character letter) {
        return convertCategoryListToDTO(categoryRepository.findAllByNameStartingWith(Character.toUpperCase(letter)));
    }

}
