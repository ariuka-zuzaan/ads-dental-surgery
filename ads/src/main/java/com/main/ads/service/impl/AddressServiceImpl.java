package com.main.ads.service.impl;

import org.springframework.stereotype.Service;

import com.main.ads.model.Address;
import com.main.ads.repository.AddressRepository;
import com.main.ads.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
   
    AddressRepository addressRepository;
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }
    
    @Override
    public java.util.List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    @Override
    public Address addNewAddress(Address newAddress) {
        return addressRepository.save(newAddress);
    }

    @Override
    public Address getAddressId(Long addressId) {
        return addressRepository.findById(addressId)
                .orElse(null);
    }

    @Override
    public Address updateAddress(Address editedPublished) {
        return addressRepository.save(editedPublished);
    }

    @Override
    public void deleteAddressById(Long addressId) {
        addressRepository.deleteById(addressId);
        
    }
    
}
