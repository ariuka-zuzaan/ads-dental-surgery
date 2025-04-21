package com.main.ads.dto.response;


public record AddressResponse2(
        Long addressId,
        String street,
        String city,
        String state,
        String zipCode,
        PatientResponse2 patient
) {
}
