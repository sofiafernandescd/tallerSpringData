package org.springframework.samples.petclinic.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Bill;
import org.springframework.samples.petclinic.repository.BillRepository;
import org.springframework.samples.petclinic.service.BillService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
@Service
public class BillServiceImpl implements BillService{
	//Injetamos interface de BillService
	@Autowired
	private BillRepository billRepository;
	
	
	
	public List<Bill>findAll() {
		return billRepository.findAll();
	}
	public Bill findById(Integer id) {
		return this.billRepository.findOne(id);
	}
	@Override
	public @ResponseBody Bill createBill(Bill newBill) {
		return this.billRepository.save(newBill);
	}
	public Bill save(Bill bill) {
		return billRepository.save(bill);
	}
	
	public void alterData(Integer id, Date data) {
		Bill bill = billRepository.findOne(id);
		bill.setPaymentDate(data);
		billRepository.save(bill);
	}
	@Override
	public void deleteBill(Bill bill) {
		billRepository.delete(bill);
		
	}
	public @ResponseBody Bill updateBill(@RequestBody Bill bill) {
		return this.billRepository.save(bill);
	}
	@Override
	public List<Bill> findByMoneyGreaterThan(double money) {
		return billRepository.findByMoneyGreaterThan(money);
	}
	@Override
	public List<Bill> findByMoneyLessThan(double money) {
		return billRepository.findByMoneyLessThan(money);
	}
	public long count() {
		return billRepository.count();
	}
}
