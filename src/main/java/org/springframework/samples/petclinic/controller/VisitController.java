package org.springframework.samples.petclinic.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.Visit;
import org.springframework.samples.petclinic.service.impl.PetServiceImpl;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

public class VisitController {
	@Autowired
	public PetServiceImpl petService;
	@ModelAttribute("visit")
	public Visit loadPetWithVisit(@PathVariable("petId") int petId, Map<String, Object> model) {
        Pet pet = this.petService.findById(petId);
        model.put("pet", pet);
        Visit visit = new Visit();
        pet.addVisit(visit);
        return visit;
	}

}
