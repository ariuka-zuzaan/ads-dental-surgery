package com.main.ads.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.ads.model.Surgery;


// @Repository
public interface SurgeryRepository extends JpaRepository<Surgery, Long> {
}
