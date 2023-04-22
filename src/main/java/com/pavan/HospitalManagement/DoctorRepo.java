package com.pavan.HospitalManagement;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepo extends CrudRepository<Doctor, Integer>{

}
