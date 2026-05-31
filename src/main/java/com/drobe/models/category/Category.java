package com.drobe.models.category;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Data
public class Category {

    @Id
    private String id;
    private String name;
    private String imageUrl;
    private List<Level2Category> level2 = new ArrayList<>();
}
