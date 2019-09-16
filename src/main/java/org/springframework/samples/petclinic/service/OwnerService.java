package org.springframework.samples.petclinic.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Owner;


public interface OwnerService {
	
Owner findById(Integer id);

List<Owner> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);

List<Owner> searchOwner(String query);

List<Owner> findByOrderByLastName();

}
