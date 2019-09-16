package org.springframework.samples.petclinic.service;

import java.util.List;

import org.springframework.samples.petclinic.model.Visit;

public interface VisitService {
	
	List<Visit> findByPetId(Integer petId);
	List<Visit> findTop4ByOrderByDateDesc();

}
