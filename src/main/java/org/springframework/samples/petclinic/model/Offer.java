package org.springframework.samples.petclinic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="offers")
public class Offer extends BaseEntity{
	
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Digits(integer=5, fraction=2)
	@DecimalMin("0.0")
	@Column(name="discount")
	private double discount;
	
	@Temporal(TemporalType.DATE)
  @DateTimeFormat(pattern = "yyyy/MM/dd")
	@Column(name="expire_date")
	private Date expireDate;

	public long getIdOferta() {
		return id;
	}

	public void setIdOferta(long idOffer) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	
	public Offer() {
	}

	public Offer(Integer id, String title, String description, double discount, Date expireDate) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.discount = discount;
		this.expireDate = expireDate;
	}
	
	

}
