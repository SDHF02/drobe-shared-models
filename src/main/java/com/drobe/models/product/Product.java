package com.drobe.models.product;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class Product {
    private String id;
    private String name;
    private String description;
    private Double price;
    private String brandId;
    private List<String> images;
    private List<ProductConfiguration> configurations;
    private String style;
    private String gender;
    private boolean live;
    private String productType;
    private String categoryId;
    private String subCategoryName;
}
