package com.drobe.models.order;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "orderItem")
public class OrderItemEntity {

    @Id
    private String id; // MongoDB ObjectId

    @Field("Order_Item_id")
    private Integer orderItemId;

    @Field("Purchase_Order_id")
    private Integer purchaseOrderId;

    @Field("Sub_Order_id")
    private Integer subOrderId;

    @Field("Product_Variant_id")
    private Integer productVariantId;

    @Field("Quantity")
    private Integer quantity;

    @Field("Price_at_Purchase")
    private Double priceAtPurchase;

    @Field("Supplier_Settltement_id")
    private Integer supplierSettlementId;

    @Field("brand_id")
    private String brandId;

    // Additional fields for easier querying
    @Field("product_name")
    private String productName;

    @Field("product_image")
    private String productImage;

    @Field("color")
    private String color;

    @Field("size")
    private String size;
}
