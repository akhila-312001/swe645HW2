/*Done by  1. Naga Karthik Nandyala
         2. Akhila Penukonda
         3. Reddy Phanidhar Reddy
*/

package com.swe.HW3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Survey")
public class Survey {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private String state;
	private int zip;
	private String dos;
	private String[] likedMost;
	private String interested;
	private String recommendation;
	private String Comments;
	private String streetAddress;



	public Survey() {

	}


	public Survey(Long id, String firstName, String lastName, String city, String state, int zip,
			 String email, String dos, String[] likedMost, String interested, String recommendation,
			String comments, String streetAddress) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.zip = zip;

		this.email = email;
		this.dos = dos;
		this.likedMost = likedMost;
		this.interested = interested;
		this.recommendation = recommendation;
		this.Comments = comments;
		this.streetAddress = streetAddress;
	}


	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDos() {
		return dos;
	}
	public void setDos(String dos) {
		this.dos = dos;
	}
	public String[] getLikedMost() {
		return likedMost;
	}
	public void setLikedMost(String[] likedMost) {
		this.likedMost = likedMost;
	}
	public String getInterested() {
		return interested;
	}
	public void setInterested(String interested) {
		this.interested = interested;
	}
	public String getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


}
