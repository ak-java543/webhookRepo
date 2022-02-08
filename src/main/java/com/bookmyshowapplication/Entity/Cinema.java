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
@Table(name = "cinema")
public class Cinema {

	@Id
	@Column(name = "cinemaid")
	private int id;
	private String name;
	private int totalcinemahal;

	@ManyToOne
	@JoinColumn(name = "cityid")
	private City city;
	
	@OneToMany(mappedBy = "cinema", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<CinemaHall> cinemahall;

	public List<CinemaHall> getCinemahall() {
		return cinemahall;
	}

	public void setCinemahall(List<CinemaHall> cinemahall) {
		this.cinemahall = cinemahall;
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

	public int getTotalcinemahal() {
		return totalcinemahal;
	}

	public void setTotalcinemahal(int totalcinemahal) {
		this.totalcinemahal = totalcinemahal;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Cinema [id=" + id + ", name=" + name + ", totalcinemahal=" + totalcinemahal + ", city=" + city + "]";
	}

}
