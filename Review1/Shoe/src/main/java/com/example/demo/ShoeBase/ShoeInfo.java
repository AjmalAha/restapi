package com.example.demo.ShoeBase;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ShoeInfo 
{
	private String shoeprice;
	@Id
	private int shoeratingsoutof10;
	private String shoewarranty;
	private String shoeoffers;
	private String shoeofferprice;
	private String shoematerial;
	private String shoecolour;
	
	public String getShoeprice() {
		return shoeprice;
	}
	public void setShoeprice(String shoeprice) {
		this.shoeprice = shoeprice;
	}

	public int getShoeratingsoutof10() {
		return shoeratingsoutof10;
	}
	public void setShoeratingsoutof10(int shoeratingsoutof10) {
		this.shoeratingsoutof10 = shoeratingsoutof10;
	}
	public String getShoewarranty() {
		return shoewarranty;
	}
	public void setShoewarranty(String shoewarranty) {
		this.shoewarranty = shoewarranty;
	}
	public String getShoeoffers() {
		return shoeoffers;
	}
	public void setShoeoffers(String shoeoffers) {
		this.shoeoffers = shoeoffers;
	}
	public String getShoeofferprice() {
		return shoeofferprice;
	}
	public void setShoeofferprice(String shoeofferprice) {
		this.shoeofferprice = shoeofferprice;
	}
	public String getShoematerial() {
		return shoematerial;
	}
	public void setShoematerial(String shoematerial) {
		this.shoematerial = shoematerial;
	}
	public String getShoecolour() {
		return shoecolour;
	}
	public void setShoecolour(String shoecolour) {
		this.shoecolour = shoecolour;
	}
	
	
}