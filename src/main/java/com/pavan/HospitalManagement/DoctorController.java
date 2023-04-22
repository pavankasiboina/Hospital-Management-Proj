package com.pavan.HospitalManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DoctorController {
	
	@Autowired
	DoctorRepo doctorRepo;
	
	@PostMapping("/doctors")
	public ResponseEntity<Doctor> createDoctor(@RequestBody Doctor doctor) {
		return new ResponseEntity<>(doctorRepo.save(doctor),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/doctors")
	public ResponseEntity<List<Doctor>> getDoctors(){
		doctorRepo.findAll();
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	@GetMapping("/doctors/{id}")
	public ResponseEntity<Doctor> getDoctor(@PathVariable int id){
		java.util.Optional<Doctor> doctor = doctorRepo.findById(id);
		if(doctor.isPresent()) {
			return new ResponseEntity<>(doctor.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/doctors/{id}")
	public ResponseEntity<Doctor> updateDoctor(@PathVariable int id,@RequestBody Doctor doct){
		java.util.Optional<Doctor> doctor = doctorRepo.findById(id);
		if(doctor.isPresent()) {
			doctor.get().setDoc_Name(doct.getDoc_Name());
			doctor.get().setDoc_Email(doct.getDoc_Email());
			doctor.get().setDoc_Mobile(doct.getDoc_Mobile());
			doctor.get().setDoc_Address(doct.getDoc_Address());
			doctor.get().setDoc_SpecialistIn(doct.getDoc_SpecialistIn());
			return new ResponseEntity<>(doctorRepo.save(doctor.get()),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/doctors/{id}")
	public ResponseEntity<Doctor> deleteDoctor(@PathVariable int id){
		java.util.Optional<Doctor> doctor = doctorRepo.findById(id);
		if(doctor.isPresent()) {
			doctorRepo.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

    
	
	
}