package com.ecommerce.category.service;

import com.ecommerce.category.dto.CategoryRequest;
import com.ecommerce.category.dto.CategoryResponse;
import com.ecommerce.category.model.Category;
import com.ecommerce.category.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public CategoryResponse create(CategoryRequest request) {
        Category category = Category.builder().name(request.name()).build();
        return mapToResponse(repository.save(category));
    }

    public List<CategoryResponse> findAll() {
        return repository.findAll().stream().map(this::mapToResponse).toList();
    }

    public Category getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found: " + id));
    }

    public Category getByName(String name) {
        return repository.findByName(name)
                .orElseThrow(() -> new RuntimeException("Category not found: " + name));
    }

    private CategoryResponse mapToResponse(Category category) {
        return new CategoryResponse(category.getId(), category.getName());
    }
}
