package com.bookmyshowapplication.Entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "paymentdetails")
public class PaymentDetails {
	@Id
	@Column(name = "paymentdetailsid")
	private int id;
	private int amount;
	private Timestamp paytime;
	private int paymentmethod;

	@OneToOne
	@JoinColumn(name = "bookingid")
	private Booking booking;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Timestamp getPaytime() {
		return paytime;
	}

	public void setPaytime(Timestamp paytime) {
		this.paytime = paytime;
	}

	public int getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(int paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "PaymentDetails [id=" + id + ", amount=" + amount + ", paytime=" + paytime + ", paymentmethod="
				+ paymentmethod + ", booking=" + booking + "]";
	}

}
