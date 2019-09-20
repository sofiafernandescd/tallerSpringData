package org.springframework.samples.petclinic.service;

import java.util.Date;
import java.util.List;

import org.springframework.samples.petclinic.model.Offer;

public interface OfferService {

	void saveOffer(Offer offer);
	
	Offer createOffer(Offer offer);
	
	Offer findById(Integer id);
	
	List<Offer> findAll();
	
	void alterExpireDate(Integer id, Date date);
	
	void deleteOffer(Integer id);
	
	List<Offer> findByExpireDateGreaterThan(Date date);
	
	
}
