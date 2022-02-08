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
@Table(name = "city")
public class City {
	@Id
	@Column(name = "cityid")
	private int id;
	private String name;
	private String state;
	private String zipcode;

	@OneToMany(mappedBy = "city", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	List<Cinema> cinema;

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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", state=" + state + ", zipcode=" + zipcode + "]";
	}

}