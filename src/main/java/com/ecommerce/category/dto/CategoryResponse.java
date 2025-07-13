package com.ecommerce.category.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Category response object")
public record CategoryResponse (
        @Schema(description = "Category ID", example = "1") Long id,
        @Schema(description = "Category name", example = "Electronics") String name
){}
