package com.main.ads.dto.response;

public record AddressResponseDto(
    Integer addressId,
    String street,
    String city,
    String state,
    String zipCode
) {
}
