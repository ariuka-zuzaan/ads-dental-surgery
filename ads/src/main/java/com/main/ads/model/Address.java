package com.main.ads.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "addresses")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId; // address_id

    private String street;
    private String city;
    private String state;
    @Column(length = 16)
    private String zipCode;

    @OneToOne(mappedBy = "address")
    private Patient patient;
    
    // @OneToOne(mappedBy = "address")
    // private Surgery surgery;

    public Address(String city, String state, String street, String zipCode) {
    
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

}