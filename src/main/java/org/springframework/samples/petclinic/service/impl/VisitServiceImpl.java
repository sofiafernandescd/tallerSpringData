package org.springframework.samples.petclinic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Visit;
import org.springframework.samples.petclinic.repository.PetRepository;
import org.springframework.samples.petclinic.repository.VisitRepository;
import org.springframework.samples.petclinic.service.VisitService;
import org.springframework.stereotype.Service;
@Service
public class VisitServiceImpl implements VisitService{
	@Autowired
	VisitRepository visitRepository;
	
	@Override
	public List<Visit> findByPetId(Integer petId) {
		return visitRepository.findByPetId(petId);
	}

	@Override
	public List<Visit> findTop4ByOrderByDateDesc() {
		return visitRepository.findTop4ByOrderByDateDesc();
	}
	
	

}
