package com.main.ads.service.impl;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.main.ads.dto.request.PatientRequest;
import com.main.ads.dto.response.AddressResponse;
import com.main.ads.dto.response.PatientResponse;
import com.main.ads.exception.PatientNotFoundException;
import com.main.ads.model.Address;
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
    public List<PatientResponse> getAllPatients() {
        return patientRepository.findAll(Sort.by("lastName").ascending())
        .stream()
        .map(p -> new PatientResponse(
                p.getPatientId(),
                p.getFirstName(),
                p.getLastName(),
                p.getEmail(),
                p.getPhoneNumber(),
                (p.getAddress()!=null)?new AddressResponse(
                        p.getAddress().getAddressId(),
                        p.getAddress().getStreet(),
                        p.getAddress().getCity(),
                        p.getAddress().getState(),
                        p.getAddress().getZipCode()
                ):null
        )).toList();
    }

    @Override
    public PatientResponse addNewPatient(PatientRequest patientRequest) {
        var newPatient = new Patient(null,
                patientRequest.firstName(), 
                patientRequest.lastName(), 
                patientRequest.email(),
                patientRequest.phoneNumber(),
                (patientRequest.address()!=null) ? new Address(null,
                    patientRequest.address().city(),
                    patientRequest.address().state(),
                    patientRequest.address().street(),
                    patientRequest.address().zipCode()):null);
        var savedPatient =  patientRepository.save(newPatient);
        System.out.println("Saved patient!!!!" + savedPatient.getPatientId());
        return new PatientResponse(
                savedPatient.getPatientId(),
                savedPatient.getFirstName(),
                savedPatient.getLastName(),
                savedPatient.getEmail(),
                savedPatient.getPhoneNumber(),
                (savedPatient.getAddress()!=null) ? new AddressResponse(
                        savedPatient.getAddress().getAddressId(),
                        savedPatient.getAddress().getCity(),
                        savedPatient.getAddress().getState(),
                        savedPatient.getAddress().getStreet(),
                        savedPatient.getAddress().getZipCode()):null
        );
    }

    @Override
    public Patient getPatientById(Long patientId) throws PatientNotFoundException {
        return patientRepository.findById(patientId)
                .orElseThrow(() -> new PatientNotFoundException(String.format("Error: Patient with Id %d , is not found",
                patientId)));
    }

    @Override
    public Patient updatePatient(Long patientId, Patient editedPatient) {
        var patient = patientRepository.findById(patientId).orElse(null);
        if(patient != null ) {
            patient.setFirstName(editedPatient.getFirstName());
            patient.setLastName(editedPatient.getLastName());
            patient.setEmail(editedPatient.getEmail());
            patient.setPhoneNumber(editedPatient.getPhoneNumber());

            if(patient.getAddress()!=null) {
                var address = patient.getAddress();
                address.setStreet(editedPatient.getAddress().getStreet());
                address.setCity(editedPatient.getAddress().getCity());
                address.setState(editedPatient.getAddress().getState());
                address.setZipCode(editedPatient.getAddress().getZipCode());
            } else {
                var newAddress = new Address();
                newAddress.setStreet(editedPatient.getAddress().getStreet());
                newAddress.setCity(editedPatient.getAddress().getCity());
                newAddress.setState(editedPatient.getAddress().getState());
                newAddress.setZipCode(editedPatient.getAddress().getZipCode());
                patient.setAddress(newAddress);
            }
            return patientRepository.save(patient);
        } else {
            return null;
        }
    }

    @Override
    public void deletePatientById(Long patientId) {
        patientRepository.deleteById(patientId);
        
    }

    @Override
    public List<Patient> searchPatient(String searchString) {
        return patientRepository.findPatientsByFirstNameContainingOrLastNameContainingOrAddress_StreetContainingOrAddress_CityContainingOrAddress_StateContaining(searchString,searchString,searchString,searchString,searchString);
    }
    
}
