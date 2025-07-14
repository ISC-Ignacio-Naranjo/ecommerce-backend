package com.ecommerce.category.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "Category request object")
public record CategoryRequest(
        @Schema(description = "Category name", example = "Electronics")
        @NotBlank(message = "Name is required")
        String name,

        @Schema(description = "Category description", example = "All kinds of electronic devices")
        @NotBlank(message = "Description is required")
        String description
) {}
