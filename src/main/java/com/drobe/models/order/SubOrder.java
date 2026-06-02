package com.drobe.models.order;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class SubOrder {

    private String id;

    private Integer subOrderId;

    private Integer purchaseOrderId;

    private Integer userId;

    // The brand's name IS its id in the shared Brand model
    private String brandId;

    private String orderStatus; // "pending", "confirmed", "shipped", "delivered", "cancelled"

    private Double totalAmount; // Sum of this brand's item prices (excludes shipping/service)

    private Integer itemCount;

    private Date createdAt;
}

