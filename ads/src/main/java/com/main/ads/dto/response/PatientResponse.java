package com.main.ads.dto.response;

public record PatientResponse(
    Long patientId,
    String firstName,
    String lastName,
    String email,
    String phoneNumber,
    AddressResponse address
) {
}
