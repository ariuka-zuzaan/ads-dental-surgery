package com.main.ads.service;
import java.util.List;
import java.util.Optional;

import com.main.ads.dto.request.PatientRequest;
import com.main.ads.dto.response.PatientResponse;
import com.main.ads.exception.PatientNotFoundException;
import com.main.ads.model.Patient;

public interface PatientService {

        List<PatientResponse> getAllPatients();

        PatientResponse addNewPatient(PatientRequest newPatient);
    
        Patient getPatientById(Long patientId) throws PatientNotFoundException;
    
        Patient updatePatient(Long patientId, Patient editedPublished);
    
        void deletePatientById(Long patientId);

        List<Patient>  searchPatient(String searchString);

}
