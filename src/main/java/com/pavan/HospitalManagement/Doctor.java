package com.pavan.HospitalManagement;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Doctor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String doc_Name;
	private String doc_Email;
	private String doc_Mobile;
	private String doc_Address;
	private String doc_SpecialistIn;
	private int doc_TotalExperience;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDoc_Name() {
		return doc_Name;
	}
	public void setDoc_Name(String doc_Name) {
		this.doc_Name = doc_Name;
	}
	public String getDoc_Email() {
		return doc_Email;
	}
	public void setDoc_Email(String doc_Email) {
		this.doc_Email = doc_Email;
	}
	public String getDoc_Mobile() {
		return doc_Mobile;
	}
	public void setDoc_Mobile(String doc_Mobile) {
		this.doc_Mobile = doc_Mobile;
	}
	public String getDoc_Address() {
		return doc_Address;
	}
	public void setDoc_Address(String doc_Address) {
		this.doc_Address = doc_Address;
	}
	public String getDoc_SpecialistIn() {
		return doc_SpecialistIn;
	}
	public void setDoc_SpecialistIn(String doc_SpecialistIn) {
		this.doc_SpecialistIn = doc_SpecialistIn;
	}
	public int getDoc_TotalExperience() {
		return doc_TotalExperience;
	}
	public void setDoc_TotalExperience(int doc_TotalExperience) {
		this.doc_TotalExperience = doc_TotalExperience;
	}
	public Doctor(int id, String doc_Name, String doc_Email, String doc_Mobile, String doc_Address,
			String doc_SpecialistIn, int doc_TotalExperience) {
		super();
		this.id = id;
		this.doc_Name = doc_Name;
		this.doc_Email = doc_Email;
		this.doc_Mobile = doc_Mobile;
		this.doc_Address = doc_Address;
		this.doc_SpecialistIn = doc_SpecialistIn;
		this.doc_TotalExperience = doc_TotalExperience;
	}
	public Doctor() {
		super();
		
	}
	
	
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", doc_Name=" + doc_Name + ", doc_Email=" + doc_Email + ", doc_Mobile=" + doc_Mobile
				+ ", doc_Address=" + doc_Address + ", doc_SpecialistIn=" + doc_SpecialistIn + ", doc_TotalExperience="
				+ doc_TotalExperience + "]";
	}
	
	
	
	
	
	

}
