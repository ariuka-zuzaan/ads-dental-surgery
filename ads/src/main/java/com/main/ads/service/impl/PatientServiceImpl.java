package com.main.ads.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.ads.model.Patient;
import com.main.ads.repository.PatientRepository;
import com.main.ads.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
    PatientRepository patientRepository;
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient addNewPatient(Patient newPatient) {
        return patientRepository.save(newPatient);
    }

    @Override
    public Patient getPatientId(Long patientId) {
        return patientRepository.findById(patientId)
                .orElseThrow(() -> new RuntimeException("Patient not found with id: " + patientId));
    }

    @Override
    public Patient updatePatient(Patient editedPublished) {
        return patientRepository.save(editedPublished);
    }

    @Override
    public void deletePatientById(Long patientId) {
        patientRepository.deleteById(patientId);
        
    }
    
}
