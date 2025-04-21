package com.main.ads.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.ads.dto.request.PatientRequest;
import com.main.ads.dto.response.PatientResponse;
import com.main.ads.exception.PatientNotFoundException;
import com.main.ads.model.Patient;
import com.main.ads.service.PatientService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/ads/api/v1/patients")
public class PatientController {

    private final PatientService patientService;


    @GetMapping
    public ResponseEntity<List<PatientResponse>> listPatients() {
        return ResponseEntity.ok(patientService.getAllPatients());
    }

    // Send patientId as Query Parameter
//    @GetMapping(value = "/citylibrary/api/v1/patient/?patientId={patientId}")
//    public ResponseEntity<Patient> getPatientById(@RequestParam Long patientId) {
//
//    }

    // Send patientId as PathVariable
    @GetMapping(value = "/{patientId}")
    public ResponseEntity<Patient> getPatientById(@PathVariable Long patientId) throws PatientNotFoundException {
        System.out.println("PatienId: " + patientId);
        return ResponseEntity.ok(patientService.getPatientById(patientId));
    }

    @PostMapping
    public ResponseEntity<PatientResponse> registerNewPatient(@Valid @RequestBody PatientRequest patientRequest) {
        return new ResponseEntity<>(patientService.addNewPatient(patientRequest), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{patientId}")
    public ResponseEntity<Patient> updatePatient(@PathVariable Long patientId,
                                                     @RequestBody Patient editedPatient) {
        return new ResponseEntity<>(patientService.updatePatient(patientId,editedPatient),
                HttpStatus.OK);
    }

    @DeleteMapping(value = "/{patientId}")
    public ResponseEntity<Void> deletePatient(@PathVariable Long patientId) {
        patientService.deletePatientById(patientId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @GetMapping(value = "/search/{searchString}")
    public ResponseEntity<List<Patient>> searchPatient(@PathVariable String searchString) {
        return ResponseEntity.ok(patientService.searchPatient(searchString));
    }

}