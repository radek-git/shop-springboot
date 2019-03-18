package com.radek.shopspringboot.repository;

import com.radek.shopspringboot.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByName(String name);

    List<Category> findAllByNameStartingWith(Character letter);
}
