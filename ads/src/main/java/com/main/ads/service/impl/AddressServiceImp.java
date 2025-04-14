package com.main.ads.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.ads.model.Address;
import com.main.ads.repository.AddressRepository;
import com.main.ads.service.AddressService;

@Service
public class AddressServiceImp implements AddressService {
    @Autowired
    AddressRepository addressRepository;
    
    @Override
    public java.util.List<Address> getAllAddresss() {
        return addressRepository.findAll();
    }

    @Override
    public Address addNewAddress(Address newAddress) {
        return addressRepository.save(newAddress);
    }

    @Override
    public Address getAddressId(Integer addressId) {
        return addressRepository.findById(addressId)
                .orElse(null);
    }

    @Override
    public Address updateAddress(Address editedPublished) {
        return addressRepository.save(editedPublished);
    }

    @Override
    public void deleteAddressById(Integer addressId) {
        addressRepository.deleteById(addressId);
        
    }
    
}
