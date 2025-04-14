package com.main.ads.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.ads.model.Address;


@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
