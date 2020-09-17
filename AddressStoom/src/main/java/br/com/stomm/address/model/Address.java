package br.com.stomm.address.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;
	private String streetName;
	private int number;
	private String complement;
	private String neighbourhood;
	private String city;
	private String state;
	private String country;
	private int zipcode;
	private long latitude;
	private long longitude;
	
	
	
	
//	public Address(String city, String complement, String country, long latitude, long longitude, 
//			String neighbourhood, int number,  String state, String streetName,   int zipcode ) {
//		this.streetName = streetName;
//		this.number = number;
//		this.complement = complement;
//		this.neighbourhood = neighbourhood;
//		this.city = city;
//		this.state = state;
//		this.country = country;
//		this.zipcode = zipcode;
//		this.latitude = latitude;
//		this.longitude = longitude;
//	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getNeighbourhood() {
		return neighbourhood;
	}
	public void setNeighbourhood(String neighbourhood) {
		this.neighbourhood = neighbourhood;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public long getLatitude() {
		return latitude;
	}
	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}
	public long getLongitude() {
		return longitude;
	}
	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}
	
	
	
	
	
	

}
