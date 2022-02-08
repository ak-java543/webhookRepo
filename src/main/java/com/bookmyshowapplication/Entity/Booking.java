package com.bookmyshowapplication.Entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {
	@Id
	@Column(name = "bookingid")
	private int id;
	private int noofseats;
	private Timestamp datetime;
	private int status;

	@ManyToOne
	@JoinColumn(name = "showid")
	Show show;

	@ManyToOne
	@JoinColumn(name = "userid")
	User user;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoofseats() {
		return noofseats;
	}

	public void setNoofseats(int noofseats) {
		this.noofseats = noofseats;
	}

	public Timestamp getDatetime() {
		return datetime;
	}

	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", noofseats=" + noofseats + ", datetime=" + datetime + ", status=" + status
				+ ", show=" + show + ", user=" + user + "]";
	}

}
