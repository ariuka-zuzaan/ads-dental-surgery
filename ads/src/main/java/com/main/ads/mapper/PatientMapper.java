// package com.main.ads.mapper;

// import java.util.List;

// import org.mapstruct.Mapper;
// import org.mapstruct.Mapping;
// import org.mapstruct.MappingConstants;

// import com.main.ads.dto.request.PatientRequest;
// import com.main.ads.dto.response.PatientResponse;
// import com.main.ads.model.Patient;

// @Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = { AddressMapper.class })
// public interface PatientMapper {
//     // mapping from patientRequest to patient
//     @Mapping(source = "addressRequest", target = "address")
//     Patient patientRequestToPatient(PatientRequest patientRequest);

//      // mapping from patient to patientResponse
//     @Mapping(source = "address", target = "addressResponse")
//     PatientResponse patientToPatientResponse(Patient patient);

//     //  mapping from List<Patient> to List<PatientResponse>
//     @Mapping(source = "address", target = "addressResponse")
//     List<PatientResponse> patientToPatientResponseList(List<Patient> patients);

    
// }
