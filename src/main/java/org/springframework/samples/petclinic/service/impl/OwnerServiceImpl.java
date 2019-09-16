package org.springframework.samples.petclinic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.samples.petclinic.service.OwnerService;

public class OwnerServiceImpl implements OwnerService{

	@Autowired
	private OwnerRepository ownerRepository;
	
	@Override
	public Owner findById(Integer id) {
		return ownerRepository.findById(id);
	}

	@Override
	public List<Owner> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName) {
		return ownerRepository.findByFirstNameContainingOrLastNameContaining(firstName, lastName);
	}

	@Override
	public List<Owner> searchOwner(String query) {
		return ownerRepository.searchOwner(query);
	}

	@Override
	public List<Owner> findByOrderByLastName() {
		return ownerRepository.findByOrderByLastName();
	}
	
}
