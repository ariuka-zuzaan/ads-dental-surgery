package com.main.ads;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.Flow.Publisher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.main.ads.model.Address;
import com.main.ads.model.Appointment;
import com.main.ads.model.Dentist;
import com.main.ads.model.Patient;
import com.main.ads.model.Surgery;
import com.main.ads.service.AddressService;
import com.main.ads.service.AppointmentService;
import com.main.ads.service.DentistService;
import com.main.ads.service.PatientService;
import com.main.ads.service.SurgeryService;


@SpringBootApplication
public class AdsApplication implements CommandLineRunner {

	private final AppointmentService appointmentService;
	private final DentistService dentistService;
	private final PatientService patientService;
	private final SurgeryService surgeryService;
	private final AddressService addressService;

	public AdsApplication(AppointmentService appointmentService,
		DentistService dentistService,
		PatientService patientService,
		SurgeryService surgeryService,
		AddressService addressService) {
			this.appointmentService = appointmentService;
			this.dentistService = dentistService;		
			this.patientService = patientService;
			this.surgeryService = surgeryService;
			this.addressService = addressService;
		}

	public static void main(String[] args) {
		SpringApplication.run(AdsApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
		Address address = new Address("123 Main St", "Cityville", "CA", "12345");
        addressService.addNewAddress(address);

        // Create Surgery with Address
        Surgery surgery = new Surgery("S001", address);
        surgeryService.addNewSurgery(surgery);

        // Create Patient
        Patient patient = new Patient("Alice Smith", "555-1234", "alice@example.com", address);
        patientService.addNewPatient(patient);

        // Create Dentist (Doctor)
        Dentist dentist = new Dentist("Dr. John", "Doe", "Orthodontist");
        dentistService.addNewDentist(dentist);

       
		Appointment appointment = new Appointment(patient, dentist, surgery, LocalDate.parse("2025-04-14"), LocalTime.parse("10:00"));
        appointmentService.addNewAppointment(appointment);
	}
}
