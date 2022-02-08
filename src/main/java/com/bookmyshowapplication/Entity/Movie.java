package com.bookmyshowapplication.Entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {
	@Id
	@Column(name = "movieid")
	private Integer movieid;

	private String title;
	private String description;
	private String languge;
	private Date releseDate;
	private String country;
	private String genre;

	@OneToMany(mappedBy = "movie", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	List<Show> shows;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Show> getShow() {
		return shows;
	}

	public void setShow(List<Show> show) {
		this.shows = show;
	}

	public int getId() {
		return movieid;
	}

	public void setId(int id) {
		this.movieid = id;
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

	public String getLanguge() {
		return languge;
	}

	public void setLanguge(String languge) {
		this.languge = languge;
	}

	public Date getReleseDate() {
		return releseDate;
	}

	public void setReleseDate(Date releseDate) {
		this.releseDate = releseDate;
	}

	public String getContry() {
		return country;
	}

	public void setContry(String contry) {
		this.country = contry;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Movie [id=" + movieid + ", title=" + title + ", description=" + description + ", languge=" + languge
				+ ", releseDate=" + releseDate + ", contry=" + country + ", genre=" + genre + "]";
	}

}
