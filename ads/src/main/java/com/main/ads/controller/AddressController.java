package com.main.ads.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.ads.dto.response.AddressResponseDto;
import com.main.ads.service.AddressService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @GetMapping(value = "/adsweb/api/v1/address/list")
    public ResponseEntity<List<AddressResponseDto>> listAddress() {
        return ResponseEntity.ok(addressService.getAllAddress());
    }
    
}
