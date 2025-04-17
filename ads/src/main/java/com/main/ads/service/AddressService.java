package com.main.ads.service;
import java.util.List;

import com.main.ads.dto.response.AddressResponseDto;
import com.main.ads.model.Address;

public interface AddressService {

        List<AddressResponseDto> getAllAddress();

        Address addNewAddress(Address newAddress);
    
        Address getAddressId(Long AddressId);
    
        Address updateAddress(Address editedPublished);
    
        void deleteAddressById(Long AddressId);

}
