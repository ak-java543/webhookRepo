package com.bookmyshowapplication.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cinemahall")
public class CinemaHall {
	@Id
	@Column(name = "cinemahallid")
	private int id;
	private String name;
	private int totalseats;
	
	@ManyToOne
	@JoinColumn(name = "cinemaid")
	private Cinema cinema;
	
	@OneToMany(mappedBy = "cinemahall", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<CinemaSeats> cinemaseats;
	
	@OneToMany(mappedBy = "cinemahall",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Show> show;

	public List<Show> getShow() {
		return show;
	}

	public void setShow(List<Show> show) {
		this.show = show;
	}

	public List<CinemaSeats> getCinemaseats() {
		return cinemaseats;
	}

	public void setCinemaseats(List<CinemaSeats> cinemaseats) {
		this.cinemaseats = cinemaseats;
	}

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

	public int getTotalseats() {
		return totalseats;
	}

	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	@Override
	public String toString() {
		return "CinemaHall [id=" + id + ", name=" + name + ", totalseats=" + totalseats + ", cinema=" + cinema
				+ ", cinemaseats=" + cinemaseats + ", show=" + show + "]";
	}

}
