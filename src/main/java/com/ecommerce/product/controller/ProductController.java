package com.ecommerce.product.controller;

import com.ecommerce.common.exception.ApiError;
import com.ecommerce.product.dto.ProductRequest;
import com.ecommerce.product.dto.ProductResponse;
import com.ecommerce.product.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SecurityRequirement(name = "Bearer Authentication") // ← 🔐 Esto lo aplica a todos los endpoints del controller
@Tag(name = "Products", description = "Endpoints for managing products")
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @Operation(summary = "Create a new product")
    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ProductResponse create(@RequestBody @Valid ProductRequest request) {
        return service.create(request);
    }

    @Operation(summary = "Get all products")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Products listed successfully"),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ApiError.class)
            )),
            @ApiResponse(responseCode = "500", description = "Server error", content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = ApiError.class)
            ))
    })
    @GetMapping
    public List<ProductResponse> findAll() {
        return service.findAll();
    }
}
