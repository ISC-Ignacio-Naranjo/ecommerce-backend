package com.ecommerce.common.exception;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Schema(description = "Standard structure for API error responses")
public record ApiError(

        @Schema(description = "HTTP status code", example = "404")
        int status,

        @Schema(description = "HTTP status description", example = "Not Found")
        String error,

        @Schema(description = "Details about the error", example = "Product not found")
        String message,

        @Schema(description = "Time when the error occurred", example = "2025-07-14T17:58:03.212")
        LocalDateTime timestamp,

        @Schema(description = "Path of the request that caused the error", example = "/api/products/99")
        String path

) {}
