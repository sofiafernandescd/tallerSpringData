package org.springframework.samples.petclinic.service;

import java.util.Date;
import java.util.List;

import org.springframework.samples.petclinic.model.Bill;

// TODO: Auto-generated Javadoc
/**
 * The Interface BillService.
 */

public interface BillService {
	
	/**
	 * Creates the bill.
	 *
	 * @param newBill the new bill
	 * @return the bill
	 */
	Bill createBill(Bill newBill);
	
	/**
	 * Save.
	 *
	 * @param bill the bill
	 * @return the bill
	 */
	Bill save(Bill bill);
	
	/**
	 * Find all.
	 *
	 * @return the list
	 */
	List<Bill> findAll();
	
	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the bill
	 */
	Bill findById(Integer id);
	
	/**
	 * Alter data.
	 *
	 * @param id the id
	 * @param data the data
	 */
	void alterData(Integer id, Date data);
	
	/**
	 * Delete bill.
	 *
	 * @param bill the bill
	 */
	void deleteBill(Bill bill);
	
	Bill updateBill(Bill bill);
	
	List<Bill> findByMoneyGreaterThan(double money);
	List<Bill> findByMoneyLessThan(double money);
	long count();

}
