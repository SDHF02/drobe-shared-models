package com.dolaby.models.brand;

import com.dolaby.models.product.Product;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Brand {
    @Id
    private String name;
    private String description;
    private List<Product> products;
}
