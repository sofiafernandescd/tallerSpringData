package org.springframework.samples.petclinic.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="facturas")
public class Bill extends BaseEntity {
	
	@Digits(integer=10, fraction=0)
	@Column(name="id_number")
	private long idNumber;
	
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
	@Column(name="payment_date")
	private Date paymentDate;
	
	@Digits(integer=5, fraction=2)
	@DecimalMin("0.0")
	@Column(name="money")
	private double money;
	

	
	public Bill () {
		
	}
	
	public long getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(long idNumber) {
		this.idNumber = idNumber;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
/*
 * @OneToOne(fetch = FetchType.EAGER, mappedBy = "bill", cascade =
 * CascadeType.ALL) private Visit visit;
 * 
 * public Visit getVisit() { return visit; }
 * 
 * public void setVisit(Visit visit) { this.visit = visit; } 
 */
	
}
