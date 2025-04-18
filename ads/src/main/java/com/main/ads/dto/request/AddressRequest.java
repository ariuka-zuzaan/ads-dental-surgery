package com.main.ads.dto.request;

public record AddressRequest(
    String street,
    String city,
    String state,
    String zipCode ){
}
