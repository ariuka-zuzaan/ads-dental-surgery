package com.main.ads.service.impl;

import com.main.ads.service.SurgeryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.ads.model.Surgery;
import com.main.ads.repository.SurgeryRepository;

@Service
public class SurgeryServiceImp implements SurgeryService {
    @Autowired
    SurgeryRepository surgeryRepository;

    @Override
    public List<Surgery> getAllSurgerys() {
        return surgeryRepository.findAll();
    }

    @Override
    public Surgery addNewSurgery(Surgery newSurgery) {
        return surgeryRepository.save(newSurgery);
    }

    @Override
    public Surgery getSurgeryId(Long surgeryId) {
        return surgeryRepository.findById(surgeryId)
                .orElseThrow(() -> new RuntimeException("Surgery not found with id: " + surgeryId));
    }

    @Override
    public Surgery updateSurgery(Surgery editedSurgery) {
        return surgeryRepository.save(editedSurgery);
    }

    @Override
    public void deleteSurgeryById(Long surgeryId) {
        surgeryRepository.deleteById(surgeryId);
        
    }
    
}
