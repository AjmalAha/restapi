package com.example.demo.ShoeBase;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class ShoeDetails 
{
	@Id
	private int shoeid;
	private String modelno;
	private String additionalfeatures;
	private String shoename;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	public List<ShoeInfo> additional;
	private String shoetype;
	private String shoebrand;
	private int shoesize;
	private String nearbyshowroom;
	private long contact;
	public int getShoeid() {
		return shoeid;
	}
	public void setShoeid(int shoeid) {
		this.shoeid = shoeid;
	}
	public String getModelno() {
		return modelno;
	}
	public void setModelno(String modelno) {
		this.modelno = modelno;
	}
	public String getAdditionalfeatures() {
		return additionalfeatures;
	}
	public void setAdditionalfeatures(String additionalfeatures) {
		this.additionalfeatures = additionalfeatures;
	}
	public String getShoename() {
		return shoename;
	}
	public void setShoename(String shoename) {
		this.shoename = shoename;
	}
	public List<ShoeInfo> getAdditional() {
		return additional;
	}
	public void setAdditional(List<ShoeInfo> additional) {
		this.additional = additional;
	}
	public String getShoetype() {
		return shoetype;
	}
	public void setShoetype(String shoetype) {
		this.shoetype = shoetype;
	}
	public String getShoebrand() {
		return shoebrand;
	}
	public void setShoebrand(String shoebrand) {
		this.shoebrand = shoebrand;
	}
	public int getShoesize() {
		return shoesize;
	}
	public void setShoesize(int shoesize) {
		this.shoesize = shoesize;
	}
	public String getNearbyshowroom() {
		return nearbyshowroom;
	}
	public void setNearbyshowroom(String nearbyshowroom) {
		this.nearbyshowroom = nearbyshowroom;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	
}