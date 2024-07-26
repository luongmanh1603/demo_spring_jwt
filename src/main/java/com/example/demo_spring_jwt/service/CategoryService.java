package com.example.demo_spring_jwt.service;

import com.example.demo_spring_jwt.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo_spring_jwt.entity.Category;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;

   public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    public Category getCategoryById(Integer id) {
        return categoryRepo.findById(id).orElse(null);
    }

    public Category saveCategory(Category category) {
        return categoryRepo.save(category);
    }

    public void deleteCategory(Integer id) {
        categoryRepo.deleteById(id);
    }




}
