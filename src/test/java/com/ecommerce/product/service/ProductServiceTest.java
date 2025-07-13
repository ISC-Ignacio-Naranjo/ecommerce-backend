package com.ecommerce.product.service;

import com.ecommerce.category.model.Category;
import com.ecommerce.category.service.CategoryService;
import com.ecommerce.product.dto.ProductRequest;
import com.ecommerce.product.dto.ProductResponse;
import com.ecommerce.product.model.Product;
import com.ecommerce.product.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class ProductServiceTest {

    private ProductRepository repository;
    private ProductService service;
    private CategoryService categoryService;

    Category mockCategory;

    @BeforeEach
    void setUp() {
        repository = mock(ProductRepository.class);
        categoryService = mock(CategoryService.class);
        service = new ProductService(repository, categoryService);

        mockCategory = Category.builder()
                .id(100L)
                .name("Electronics")
                .build();
    }

    @Test
    void shouldCreateProductSuccessfully() {
        // Given
        ProductRequest request = new ProductRequest(
                "Test Product",
                "Description",
                new BigDecimal("99.99"),
                10,
                100L
        );

        Product saved = Product.builder()
                .id(1L)
                .name("Test Product")
                .description("Description")
                .price(new BigDecimal("99.99"))
                .stock(10)
                .category(mockCategory)
                .build();

        when(repository.save(any())).thenReturn(saved);

        // When
        ProductResponse response = service.create(request);

        // Then
        assertThat(response.id()).isEqualTo(1L);
        assertThat(response.name()).isEqualTo("Test Product");
        verify(repository, times(1)).save(any());
    }

    @Test
    void shouldReturnAllProducts() {
        // Given
        Product p1 = Product.builder()
                .id(1L)
                .name("P1")
                .description("D1")
                .price(new BigDecimal("10.00"))
                .stock(5)
                .category(mockCategory)
                .build();

        Product p2 = Product.builder()
                .id(2L)
                .name("P2")
                .description("D2")
                .price(new BigDecimal("20.00"))
                .stock(3)
                .category(mockCategory)
                .build();

        when(repository.findAll()).thenReturn(List.of(p1, p2));

        // When
        List<ProductResponse> products = service.findAll();

        // Then
        assertThat(products).hasSize(2);
        assertThat(products.get(0).name()).isEqualTo("P1");
        assertThat(products.get(1).name()).isEqualTo("P2");

        verify(repository, times(1)).findAll();
    }
}
