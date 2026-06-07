package com.drobe.models.order;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

@Data
public class SubOrder {

    private String id;

    private Integer subOrderId;

    private Integer purchaseOrderId;

    private Integer userId;

    // The brand's name IS its id in the shared Brand model
    private String brandId;

    private String orderStatus;

    private Double totalAmount; // Sum of this brand's item prices (excludes shipping/service)

    private Integer itemCount;

    // This brand's items in the purchase order. Populated by the checkout service.
    private List<OrderItemEntity> orderItems;

    private Date createdAt;
}

