package com.main.ads.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.main.ads.model.Appointment;


@Repository
public interface AppointmentRepositery extends JpaRepository<Appointment, Long> {
    @Query(value = "select p from Appointment p")
    public List<Appointment> getListofAppointments();
}
