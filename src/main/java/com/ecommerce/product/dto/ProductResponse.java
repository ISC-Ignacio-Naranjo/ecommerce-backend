package com.ecommerce.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

@Schema(description = "Product response object")
public record ProductResponse(
        @Schema(description = "Product ID", example = "1") Long id,
        @Schema(description = "Product name", example = "ASUS TUF Gaming Laptop") String name,
        @Schema(description = "Product description") String description,
        @Schema(description = "Product price", example = "23999.99") BigDecimal price,
        @Schema(description = "Product stock quantity", example = "10") Integer stock,
        @Schema(description = "Category ID", example = "1") Long categoryId,
        @Schema(description = "Category name", example = "Electronics") String categoryName
) {}
