package com.main.ads.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "surgeries")
public class Surgery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long surgeryId;

    private String surgeryNo;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id", nullable = true)
    private Address primaryAddress;

    public Surgery(String surgeryNo, Address primaryAddress) {
        this.surgeryNo = surgeryNo;
        this.primaryAddress = primaryAddress;
    }
    
}
