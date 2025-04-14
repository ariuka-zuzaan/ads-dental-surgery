package com.main.ads;

import java.time.LocalDate;
import java.time.LocalTime;

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
        Surgery surgery1 = new Surgery("S15", address);
		Surgery surgery2 = new Surgery("S10", address);
		Surgery surgery3 = new Surgery("S13", address);
        surgeryService.addNewSurgery(surgery1);
		surgeryService.addNewSurgery(surgery2);
		surgeryService.addNewSurgery(surgery3);

        // Create Patient
        Patient patient = new Patient("Gillian White", "555-1234", "alice@example.com", address);
		Patient patient2 = new Patient("Jill Bell", "555-1234", "alice@example.com", address);
		Patient patient3 = new Patient("Ian MacKay", "555-1234", "alice@example.com", address);
		Patient patient4 = new Patient("John Walker", "555-1234", "alice@example.com", address);
        patientService.addNewPatient(patient);
		patientService.addNewPatient(patient2);
		patientService.addNewPatient(patient3);
		patientService.addNewPatient(patient4);

        // Create Dentist (Doctor)
        Dentist dentist = new Dentist("Tony", "Smith", "Orthodontist");
		Dentist dentist2 = new Dentist("Helen", "PearsonDoe", "Orthodontist");
		Dentist dentist3 = new Dentist("Robin", "Plevin", "Orthodontist");
        dentistService.addNewDentist(dentist);

		dentistService.addNewDentist(dentist2);
		dentistService.addNewDentist(dentist3);
	
		// Create Appointment
       
		Appointment appointment = new Appointment(patient, dentist, surgery1, LocalDate.parse("12-Sep-13"), LocalTime.parse("10:00"));
		Appointment appointment2 = new Appointment(patient2, dentist2, surgery2, LocalDate.parse("12-Sep-13"), LocalTime.parse("14:00"));
		Appointment appointment3 = new Appointment(patient3, dentist2, surgery2, LocalDate.parse("12-Sep-13"), LocalTime.parse("12:00"));
		Appointment appointment4 = new Appointment(patient3, dentist3, surgery1, LocalDate.parse("14-Sep-13"), LocalTime.parse("16:30"));
		Appointment appointment5 = new Appointment(patient4, dentist3, surgery3, LocalDate.parse("15-Sep-13"), LocalTime.parse("18:00"));
       
        appointmentService.addNewAppointment(appointment);
		appointmentService.addNewAppointment(appointment2);
		appointmentService.addNewAppointment(appointment3);
		appointmentService.addNewAppointment(appointment4);
		appointmentService.addNewAppointment(appointment5);
		// Print all appointments
		System.out.println("All Appointments:");
		appointmentService.getAllAppointments().forEach(System.out::println);


	}
}
