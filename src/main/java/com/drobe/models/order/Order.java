package com.drobe.models.order;

import com.drobe.models.user.Address;
import com.drobe.models.user.User;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Order {
    private Long id;
    private User user;
    private List<OrderItem> orderItems;
    private Double totalPrice;
    private LocalDateTime orderDate;
    private OrderStatus status;
    private Address shippingAddress;
}
