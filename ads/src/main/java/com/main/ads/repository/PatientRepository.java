package com.main.ads.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.ads.model.Patient;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
     public List<Patient> findPatientsByFirstNameContainingOrLastNameContainingOrAddress_StreetContainingOrAddress_CityContainingOrAddress_StateContaining(
            String firstName, String lastName, String street, String city, String state
    );
}
