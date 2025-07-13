package com.ecommerce.product.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

@Schema(description = "Product creation request")
public record ProductRequest(
        @Schema(description = "Product name", example = "ASUS TUF Gaming Laptop")
        @NotBlank String name,

        @Schema(description = "Short description of the product", example = "Ryzen 7, 16GB RAM, RTX 4060")
        String description,

        @Schema(description = "Product price", example = "23999.99")
        @NotNull @DecimalMin("0.0") BigDecimal price,

        @Schema(description = "Product stock quantity", example = "10")
        @NotNull @Min(0) Integer stock,

        @Schema(description = "ID of the category to which the product belongs", example = "1")
        @NotNull Long categoryId
) {}
