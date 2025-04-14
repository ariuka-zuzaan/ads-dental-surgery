package com.main.ads.service.impl;

import java.util.List;
import com.main.ads.model.Appointment;
import com.main.ads.repository.AppointmentRepositery;
import com.main.ads.service.AppointmentService;

public class AppointmentServiceImp implements AppointmentService {

    public AppointmentRepositery appointmentRepository;

    public AppointmentServiceImp(AppointmentRepositery appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }
    
    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.getListofAppointments();
    }

    @Override
    public Appointment addNewAppointment(Appointment newAppointment) {
        return appointmentRepository.save(newAppointment);
    }

    @Override
    public Appointment getAppointmentId(Long appointmentId) {
        return appointmentRepository.findById(appointmentId)
                .orElse(null);
    }

    @Override
    public Appointment updateAppointment(Appointment editedAppointment) {
        return appointmentRepository.save(editedAppointment);
    }


    @Override
    public void deleteAppointmentById(Long AppointmentId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAppointmentById'");
    }
    
}
