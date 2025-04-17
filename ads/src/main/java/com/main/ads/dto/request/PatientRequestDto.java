package com.main.ads.dto.request;

public record PatientRequestDto(
    String firstName,
    String lastName,
    String email,
    String phoneNumber,
    String address,
    String city,
    String state,
    String zipCode
) {

    
}
