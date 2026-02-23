package com.dolaby.models.order;

import com.dolaby.models.user.Address;
import com.dolaby.models.user.User;
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
