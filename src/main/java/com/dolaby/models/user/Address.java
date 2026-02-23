package com.dolaby.models.user;

import lombok.Data;

@Data
public class Address {
    private Long id;
    private String street;
    private String city;
    private String area;
    private String postalCode;
    private String country;
}
