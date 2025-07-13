package com.ecommerce.category.controller;

import com.ecommerce.category.dto.CategoryRequest;
import com.ecommerce.category.dto.CategoryResponse;
import com.ecommerce.category.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SecurityRequirement(name = "Bearer Authentication")
@Tag(name = "Categories", description = "Endpoints for managing product categories")
@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @Operation(summary = "Create a new category")
    @PostMapping
    public CategoryResponse create(@RequestBody @Valid CategoryRequest request) {
        return service.create(request);
    }

    @Operation(summary = "Get all categories")
    @GetMapping
    public List<CategoryResponse> findAll() {
        return service.findAll();
    }
}
