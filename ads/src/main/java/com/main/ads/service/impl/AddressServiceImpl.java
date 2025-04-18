package com.main.ads.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.ads.dto.response.AddressResponse;
import com.main.ads.repository.AddressRepository;
import com.main.ads.service.AddressService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
   
    private final AddressRepository addressRepository;
    
    @Override
    public List<AddressResponse> getAllAddress() {
        return addressRepository.findAll()
                .stream()
                .map(a -> new AddressResponse(
                        a.getAddressId(),
                        a.getStreet(),
                        a.getCity(),
                        a.getState(),
                        a.getZipCode())).toList();
    }

}