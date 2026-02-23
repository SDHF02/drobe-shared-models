package com.drobe.models.user;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private String id;
    private String username;
    private String password;
    private String email;
    private String brandId;
    private String phoneNumber;
    private List<Address> addresses;
}
