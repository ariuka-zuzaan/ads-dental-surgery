package com.main.ads.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.ads.model.Patient;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
