package com.main.ads.service;
import java.util.List;

import com.main.ads.model.Surgery;

public interface SurgeryService {

        List<Surgery> getAllSurgerys();

        Surgery addNewSurgery(Surgery newSurgery);
    
        Surgery getSurgeryId(Long SurgeryId);
    
        Surgery updateSurgery(Surgery editedPublished);
    
        void deleteSurgeryById(Long SurgeryId);

}
