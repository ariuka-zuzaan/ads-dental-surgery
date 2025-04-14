package com.main.ads.service;
import java.util.List;

import com.main.ads.model.Appointment;

public interface AppointmentService {

        List<Appointment> getAllAppointments();

        Appointment addNewAppointment(Appointment newAppointment);
    
        Appointment getAppointmentId(Long appointmentId);
    
        Appointment updateAppointment(Appointment editedPublished);
    
        void deleteAppointmentById(Long AppointmentId);

    

}
