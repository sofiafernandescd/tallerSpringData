package org.springframework.samples.petclinic.service;

import java.util.Date;
import java.util.List;

import org.springframework.samples.petclinic.model.Pet;


public interface PetService {

	public void save(Pet pet);
	
	Pet findById(Integer id);
	
	List<Pet> findByBirthDate(Date birthDate);
	
	List<Pet> findByBirthDateBetweenOrderByBirthDate(Date date1, Date date2);
	
}
