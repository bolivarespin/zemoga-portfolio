package com.bolivarespin.zemoga.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "portfolio")
public class Portfolio{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idportfolio;
	private String description;
	private String experience_summary;
	private int id;
	private String image_url;
	private String last_names;
	private String names;
	private String tittle;
	private String twitter_user_id;
	private String twitter_user_name;
	private String user_id;
	
	public int getIdportfolio() {
		return idportfolio;
	}
	public void setIdportfolio(int idportfolio) {
		this.idportfolio = idportfolio;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getExperience_summary() {
		return experience_summary;
	}
	public void setExperience_summary(String experience_summary) {
		this.experience_summary = experience_summary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getLast_names() {
		return last_names;
	}
	public void setLast_names(String last_names) {
		this.last_names = last_names;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getTwitter_user_id() {
		return twitter_user_id;
	}
	public void setTwitter_user_id(String twitter_user_id) {
		this.twitter_user_id = twitter_user_id;
	}
	public String getTwitter_user_name() {
		return twitter_user_name;
	}
	public void setTwitter_user_name(String twitter_user_name) {
		this.twitter_user_name = twitter_user_name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	
}