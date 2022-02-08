package com.bookmyshowapplication.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@Column(name = "userid")
	private int id;
	private String name;
	private String pasworld;
	private String email;
	private String phonno;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Booking> booking;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasworld() {
		return pasworld;
	}

	public void setPasworld(String pasworld) {
		this.pasworld = pasworld;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonno() {
		return phonno;
	}

	public void setPhonno(String phonno) {
		this.phonno = phonno;
	}

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pasworld=" + pasworld + ", email=" + email + ", phonno="
				+ phonno + ", booking=" + booking + "]";
	}

}


