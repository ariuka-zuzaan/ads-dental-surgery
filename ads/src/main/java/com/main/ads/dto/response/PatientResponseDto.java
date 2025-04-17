package com.main.ads.dto.response;

public record PatientResponseDto(
    Integer patientId,
    String firstName,
    String lastName,
    String email,
    String phoneNumber,
    AddressResponseDto address
) {
    public PatientResponseDto {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First name cannot be null or blank");
        }
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last name cannot be null or blank");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or blank");
        }
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Phone number cannot be null or blank");
        }
    }
}
