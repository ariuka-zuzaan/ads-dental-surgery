package com.main.ads.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "dentists")
public class Dentist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String specialty;

    @OneToMany(mappedBy = "dentist", cascade = CascadeType.ALL)
    private List<Appointment> appointments;

    // Constructors
    public Dentist(String firstName, String lastName, String specialty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty; 
    }
    
}
