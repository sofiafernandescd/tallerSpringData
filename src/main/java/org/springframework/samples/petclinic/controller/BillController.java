package org.springframework.samples.petclinic.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.samples.petclinic.model.Bill;
import org.springframework.samples.petclinic.service.BillService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bill")
public class BillController {
	
	@Autowired
	private BillService billService;
	
	@RequestMapping(value="/createBill", method = RequestMethod.POST)
	public Bill createBill(@RequestBody Bill bill) {
		System.out.println("##Create new bill, id --> ##"+bill.getId());
		return billService.createBill(bill);
	}
	@RequestMapping(value="/bills", method=RequestMethod.GET)
	public List<Bill> findAll() {
		return this.billService.findAll();
	}
	
	@RequestMapping(value="/bills/{idBill}", method=RequestMethod.GET)
	public Bill findById(@PathVariable("idBill") Integer id) {
		Bill b = this.billService.findById(id);
		return b;
	}
	
	@RequestMapping(value="/alterBill", method=RequestMethod.PUT)
	@ResponseStatus(value=HttpStatus.NO_CONTENT)
	public void alterData (@RequestBody Bill bill){
		this.billService.alterData(bill.getId(), bill.getPaymentDate());
	}
	
	@RequestMapping(value="/updateBill", method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.NO_CONTENT)
	public void updateBill (@RequestBody Bill bill){
		this.billService.updateBill(bill);
	}
	@RequestMapping(value="/deleteBill", method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.NO_CONTENT)
	public void deleteBill (@RequestBody Bill bill){
		this.billService.deleteBill(bill);
	}
	
	@RequestMapping(value="/maisQue20/{money}", method=RequestMethod.GET)
	public List<Bill> maisQue20 (@PathVariable("money") double money){
		return billService.findByMoneyGreaterThan(money);
	}
	
	@RequestMapping(value="/menosQue20/{money}", method=RequestMethod.GET)
	public List<Bill> menosQue20 (@PathVariable("money") double money){
		return billService.findByMoneyLessThan(money);
	}
	
	@RequestMapping(value="/count", method=RequestMethod.GET)
	public long count(){
		return billService.count();
	}
	@ExceptionHandler(Exception.class)
	public String handleException(Exception ex, HttpServletRequest request) {
		return "###EXCEÇAO CUSTOMIZADA -- >"+ex.getMessage();
		
	}
	
}
