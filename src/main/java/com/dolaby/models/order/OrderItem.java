package com.dolaby.models.order;

import com.dolaby.models.product.Product;
import lombok.Data;

@Data
public class OrderItem {
    private Long id;
    private Product product;
    private Integer quantity;
    private Double price;
}
