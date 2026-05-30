package com.drobe.models.brand;

import com.drobe.models.product.Product;
import com.drobe.models.user.Address;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Brand {
    @Id
    private String name;
    private String description;
    private String imageUrl;
    private Address address;
    private List<ContactPerson> contactPersons;
}