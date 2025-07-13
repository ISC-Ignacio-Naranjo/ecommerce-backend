package com.ecommerce.common.exception;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Standard API error response")
public record ApiError(
        @Schema(description = "HTTP status code", example = "404") int status,
        @Schema(description = "Error message", example = "Product not found with id: 99") String message,
        @Schema(description = "Path of the endpoint", example = "/api/products/99") String path

) {

}
