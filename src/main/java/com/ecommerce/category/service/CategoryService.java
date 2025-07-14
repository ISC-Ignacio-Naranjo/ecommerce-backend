package com.ecommerce.category.service;

import com.ecommerce.category.dto.CategoryRequest;
import com.ecommerce.category.dto.CategoryResponse;

import java.util.List;

public interface CategoryService {

    CategoryResponse create(CategoryRequest request);
    List<CategoryResponse> findAll();
    CategoryResponse update(Long id, CategoryRequest request);
    void delete(Long id);
}
