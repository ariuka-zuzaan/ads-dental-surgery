package com.main.ads.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.ads.model.Dentist;
import com.main.ads.repository.DentistRepository;
import com.main.ads.service.DentistService; // Ensure the interface is imported

@Service
public class DentistServiceImpl implements DentistService {

    DentistRepository dentistRepository;
    public DentistServiceImpl(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    @Override
    public List<Dentist> getAllDentists() {
        return dentistRepository.findAll();
    }

    @Override
    public Dentist addNewDentist(Dentist newDentist) {
        return dentistRepository.save(newDentist);
    }

    @Override
    public Dentist getDentistId(Long dentistId) {
        return dentistRepository.findById(dentistId)
                .orElseThrow(() -> new RuntimeException("Dentist not found with id: " + dentistId));
    }

    @Override
    public Dentist updateDentist(Dentist editedPublished) {
        return dentistRepository.save(editedPublished);
    }

    @Override
    public void deleteDentistById(Long DentistId) {
        dentistRepository.deleteById(DentistId);
        
    }

}
