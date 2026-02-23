package com.drobe.models.product;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class ProductConfiguration {
    private String color;
    private String size;
    private int quantity;
    private List<String> images;
}
