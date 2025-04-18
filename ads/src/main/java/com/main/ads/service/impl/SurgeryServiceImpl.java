package com.main.ads.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.main.ads.model.Surgery;
import com.main.ads.repository.SurgeryRepository;
import com.main.ads.service.SurgeryService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class SurgeryServiceImpl implements SurgeryService {

    private final SurgeryRepository surgeryRepository;

    @Override
    public List<Surgery> getAllSurgerys() {
        return surgeryRepository.findAll();
    }

    @Override
    @Transactional
    public Surgery addNewSurgery(Surgery newSurgery) {
        System.out.println("hereee");
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
