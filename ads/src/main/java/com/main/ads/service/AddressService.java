package com.main.ads.service;
import java.util.List;

import com.main.ads.model.Address;

public interface AddressService {

        List<Address> getAllAddresss();

        Address addNewAddress(Address newAddress);
    
        Address getAddressId(Integer AddressId);
    
        Address updateAddress(Address editedPublished);
    
        void deleteAddressById(Integer AddressId);

}
