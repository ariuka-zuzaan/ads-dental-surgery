package com.main.ads.dto.request;


public record PatientRequest(
    String firstName,
    String lastName,
    String email,
    String phoneNumber,
    AddressRequest address
) {}