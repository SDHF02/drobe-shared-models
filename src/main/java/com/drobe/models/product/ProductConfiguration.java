package com.drobe.models.product;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class ProductConfiguration {
    private String color;
    private List<String> images;
    private List<SizeVariation> variations;
}
