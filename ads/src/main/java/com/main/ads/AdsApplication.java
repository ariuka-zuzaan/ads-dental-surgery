package com.main.ads;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class AdsApplication {


	public static void main(String[] args) {
		SpringApplication.run(AdsApplication.class, args);
	}

	@Bean
    CommandLineRunner commandLineRunner() {
        return (args) -> {
            System.out.println("Hello RESTful Web API");
            System.out.println("ADS Dental WebAPI server. Starting...");
            System.out.println("ADS Dental WebAPI server. Started.\nRunning Apache Tomcat service and Listening for HTTP Request on Port number, 8080");
            System.out.println("To see list of Publishers, send HTTP GET Request to the URI,\nhttp://localhost:8080/ads/api/v1/publisher/list");
        };
    }
	
	// @Override
    // public void run(String... args) throws Exception {
	// 	System.out.println("Hello Data Persistence using Spring Data JPA");
		
		// Address address = new Address("111 Main St", "Fairfield", "IA", "52556");
		// Address address2 = new Address("222 Main St", "Fairfield", "IA", "52556");
		// Address address3 = new Address("333 Main St", "Fairfield", "IA", "52556");
        // Address address4 = new Address("444 Main St", "Fairfield", "IA", "52556");
		// Address address5 = new Address("555 Main St", "Fairfield", "IA", "52556");
		// Address address6 = new Address("66 Main St", "Fairfield", "IA", "52556");
		// Address address7 = new Address("66 Main St", "Fairfield", "IA", "52556");
        
		// address = addressService.addNewAddress(address);

		// address = addressService.findAddressById(address.getAddressId());

        // Create Surgery with Address
		// Surgery surgery1 = new Surgery("S12", address);
		// Surgery surgery2 = new Surgery("S10", address2);
		// Surgery surgery3 = new Surgery("S13", address3);
	
        // surgery1 = surgeryService.addNewSurgery(surgery1);
		// surgery2 = surgeryService.addNewSurgery(surgery2);
		// surgery3 = surgeryService.addNewSurgery(surgery3);

        // // Create Patient
        // Patient patient = new Patient("Gillian White", "555-1234", "alice@example.com", address4);
		// Patient patient2 = new Patient("Jill Bell", "555-1234", "alice@example.com", address5);
		// Patient patient3 = new Patient("Ian MacKay", "555-1234", "alice@example.com", address6);
		// Patient patient4 = new Patient("John Walker", "555-1234", "alice@example.com", address7);
        // patient = patientService.addNewPatient(patient);
		// patient2 = patientService.addNewPatient(patient2);
		// patient3 = patientService.addNewPatient(patient3);
		// patient4 = patientService.addNewPatient(patient4);

        // // Create Dentist (Doctor)
        // Dentist dentist = new Dentist("Tony", "Smith", "Orthodontist");
		// Dentist dentist2 = new Dentist("Helen", "PearsonDoe", "Orthodontist");
		// Dentist dentist3 = new Dentist("Robin", "Plevin", "Orthodontist");
        
		// dentist = dentistService.addNewDentist(dentist);

		// dentist2 = dentistService.addNewDentist(dentist2);
		// dentist3 = dentistService.addNewDentist(dentist3);
	
		// // Create Appointment
       
		// Appointment appointment = new Appointment(patient, dentist, surgery1, LocalDate.parse("2013-09-12"), LocalTime.parse("10:00"));
		// Appointment appointment2 = new Appointment(patient2, dentist2, surgery2, LocalDate.parse("2013-09-12"), LocalTime.parse("14:00"));
		// Appointment appointment3 = new Appointment(patient3, dentist2, surgery2, LocalDate.parse("2013-09-13"), LocalTime.parse("12:00"));
		// Appointment appointment4 = new Appointment(patient3, dentist3, surgery1, LocalDate.parse("2013-09-14"), LocalTime.parse("16:30"));
		// Appointment appointment5 = new Appointment(patient4, dentist3, surgery3, LocalDate.parse("2013-09-15"), LocalTime.parse("18:00"));
       
        // appointmentService.addNewAppointment(appointment);
		// appointmentService.addNewAppointment(appointment2);
		// appointmentService.addNewAppointment(appointment3);
		// appointmentService.addNewAppointment(appointment4);
		// appointmentService.addNewAppointment(appointment5);
		// // Print all appointments
		

		// appointmentService.getAllAppointments().forEach(a -> {
		// 	if(a.getId() == 1){
		// 		System.out.println("All Appointments:");
		// 		System.out.println("-----------------------------------------------------");
		// 		System.out.println("|" + "ID | " + "   Patient   | " + "   Dentist  |" + "Surgery| " + "   Date    | " + "Time | ");
		// 	}
		// 	System.out.print("| " + a.getId());
		// 	System.out.print(" | " + a.getPatient().getName());
		// 	System.out.print(" | " + a.getDentist().getFirstName() + " " + a.getDentist().getLastName());
		// 	System.out.print( " | " + a.getSurgery().getSurgeryNo());
		// 	System.out.print(" | "+ a.getDate());
		// 	System.out.print(" | "+ a.getTime() + " | ");
		// 	System.out.println();
	
		// System.exit(0);


	// }
}