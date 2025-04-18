package com.main.ads.dto.response;

public record AddressResponse(
    Long addressId,
    String street,
    String city,
    String state,
    String zipCode
) {
}
