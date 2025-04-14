package com.main.ads.service;
import java.util.List;

import com.main.ads.model.Dentist;

public interface DentistService {

        List<Dentist> getAllDentists();

        Dentist addNewDentist(Dentist newDentist);
    
        Dentist getDentistId(Long DentistId);
    
        Dentist updateDentist(Dentist editedPublished);
    
        void deleteDentistById(Long DentistId);

}
