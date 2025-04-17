package com.main.ads.dto.request;

public record AddressRequestDto(
        String street,
        String city,
        String state,
        String zipCode
    ) {

}
