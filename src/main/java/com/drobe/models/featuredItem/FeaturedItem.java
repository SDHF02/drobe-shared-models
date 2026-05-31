package com.drobe.models.featuredItem;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class FeaturedItem {

    @Id
    private String id;
    private FeaturedItemType type;
    private String referenceId;
    private String imageUrl;
}
