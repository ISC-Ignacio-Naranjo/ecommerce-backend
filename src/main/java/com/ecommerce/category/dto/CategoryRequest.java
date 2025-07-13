package com.ecommerce.category.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "Category creation request")
public record CategoryRequest(
        @Schema(description = "Name of the category", example = "Electronics")
        @NotBlank String name
) {}

