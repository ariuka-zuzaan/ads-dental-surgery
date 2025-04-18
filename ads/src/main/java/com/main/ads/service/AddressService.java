package com.main.ads.service;
import java.util.List;

import com.main.ads.model.Address;

public interface AddressService {

        List<Address> getAllAddress();

        Address addNewAddress(Address newAddress);
    
        Address findAddressById(Long AddressId);
    
        Address updateAddress(Address editedPublished);
    
        void deleteAddressById(Long AddressId);

}
