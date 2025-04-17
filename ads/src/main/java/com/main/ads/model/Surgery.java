package com.main.ads.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "surgeries")
public class Surgery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long surgeryId;

    private String surgeryNo;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "address_id", unique = true, nullable = true)
    private Address address;

    public Surgery(String surgeryNo, Address address) {
        this.surgeryNo = surgeryNo;
        this.address = address;
    }
    
}
