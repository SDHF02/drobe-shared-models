package com.drobe.models.product;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class SizeVariation {
    private String size;
    private int quantity;
}
