package org.springframework.samples.petclinic.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.repository.PetRepository;
import org.springframework.samples.petclinic.service.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceImpl implements PetService{
	
	@Autowired
	private PetRepository petRepository;

	public void save(Pet pet) {
		petRepository.save(pet);
		
	}

	public Pet findById(Integer id) {
		return petRepository.findOne(id);
	}

	public List<Pet> findByBirthDate(Date birthDate) {
		return findByBirthDate(birthDate);
	}

	@Override
	public List<Pet> findByBirthDateBetweenOrderByBirthDate(Date date1, Date date2) {
		return petRepository.findByBirthDateBetweenOrderByBirthDate(date1,date2);
	}
	
	

	
	
	
}