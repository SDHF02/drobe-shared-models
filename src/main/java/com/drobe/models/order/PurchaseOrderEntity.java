package com.drobe.models.order;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(collection = "purchaseOrder")
public class PurchaseOrderEntity {

    @Id
    private String id; // MongoDB ObjectId

    @Field("Purchase_Order_id")
    private Integer purchaseOrderId;

    @Field("User_id")
    private Integer userId;

    @Field("reciept_number")
    private String receiptNumber;

    @Field("Order_status")
    private String orderStatus; // "pending", "confirmed", "shipped", "delivered", "cancelled"

    @Field("Total_amount")
    private Double totalAmount;

    @Field("shipping_fee_cost")
    private Double shippingFeeCost;

    @Field("shipping_fee_collected")
    private Integer shippingFeeCollected;

    @Field("Shipping_Company_id")
    private Integer shippingCompanyId;

    @Field("order_pdf_url")
    private String orderPdfUrl;

    @Field("order_qr_code_data")
    private String orderQrCodeData;

    @Field("last_status_update_at")
    private Date lastStatusUpdateAt;

    @Field("created_at")
    private Date createdAt;

    @Field("payment_method")
    private String paymentMethod; // "CASH" or "CARD"

    @Field("address_id")
    private Integer addressId;
}
