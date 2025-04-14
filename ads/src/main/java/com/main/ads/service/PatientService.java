package com.main.ads.service;
import java.util.List;

import com.main.ads.model.Patient;

public interface PatientService {

        List<Patient> getAllPatients();

        Patient addNewPatient(Patient newPatient);
    
        Patient getPatientId(Long patientId);
    
        Patient updatePatient(Patient editedPublished);
    
        void deletePatientById(Long patientId);

}
