package com.main.ads.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;

    private String name;
    private String phoneNumber;
    private String email;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id", unique = true, nullable = true)
    private Address primaryAddress;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Appointment> appointments;

    // Constructors, getters, and setters
    public Patient(String name, String phoneNumber, String email, Address primaryAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.primaryAddress = primaryAddress;
    }
    
}
