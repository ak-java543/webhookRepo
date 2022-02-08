package com.bookmyshowapplication.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cinemaseats")
public class CinemaSeats {

	@Id
	@Column(name = "cinemaseatid")
	private int id;
	private int seatnumber;
	private int type;

	@ManyToOne
	@JoinColumn(name = "cinemahallid")
	private CinemaHall cinemahall;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSeatnumber() {
		return seatnumber;
	}

	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public CinemaHall getCinemahall() {
		return cinemahall;
	}

	public void setCinemahall(CinemaHall cinemahall) {
		this.cinemahall = cinemahall;
	}

	@Override
	public String toString() {
		return "CinemaSeats [id=" + id + ", seatnumber=" + seatnumber + ", type=" + type + ", cinemahall=" + cinemahall
				+ "]";
	}

}
