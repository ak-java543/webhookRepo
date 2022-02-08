package com.bookmyshowapplication.Entity;

import java.sql.Timestamp;
import java.util.Date;
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
@Table(name = "show_")
public class Show {
	@Id
	@Column(name = "showid")
	private int id;
	private Date date;
	private Timestamp starttime;
	private Timestamp endtime;
	private String language;

	@ManyToOne
	@JoinColumn(name = "cinemahallid")
	private CinemaHall cinemahall;

	@ManyToOne
	@JoinColumn(name = "movieid")
	private Movie movie;
	
	@OneToMany(mappedBy = "show",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Booking> booking;

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Timestamp getStarttime() {
		return starttime;
	}

	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}

	public Timestamp getEndtime() {
		return endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public CinemaHall getCinemahall() {
		return cinemahall;
	}

	public void setCinemahall(CinemaHall cinemahall) {
		this.cinemahall = cinemahall;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Show [id=" + id + ", date=" + date + ", starttime=" + starttime + ", endtime=" + endtime + ", language="
				+ language + ", cinemahall=" + cinemahall + ", movie=" + movie + ", booking=" + booking + "]";
	}

}
