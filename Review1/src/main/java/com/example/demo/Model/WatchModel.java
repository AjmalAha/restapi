package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="watchdetails")
public class WatchModel {
	
	@Id
	private int watch_id;
	private String watch_Model;
	private String watch_company;
	private String watch_colour;
	private int watch_price;
	private String strap_material;
	private String watch_type;
	private int watch_warranty;
	private String water_resistance;
	private String watch_additionalfeatures;
	private String watch_batteryLife;
	public int getWatch_id() {
		return watch_id;
	}
	public void setWatch_id(int watch_id) {
		this.watch_id = watch_id;
	}
	public String getWatch_Model() {
		return watch_Model;
	}
	public void setWatch_Model(String watch_Model) {
		this.watch_Model = watch_Model;
	}
	public String getWatch_company() {
		return watch_company;
	}
	public void setWatch_company(String watch_company) {
		this.watch_company = watch_company;
	}
	public String getWatch_colour() {
		return watch_colour;
	}
	public void setWatch_colour(String watch_colour) {
		this.watch_colour = watch_colour;
	}
	public int getWatch_price() {
		return watch_price;
	}
	public void setWatch_price(int watch_price) {
		this.watch_price = watch_price;
	}
	public String getStrap_material() {
		return strap_material;
	}
	public void setStrap_material(String strap_material) {
		this.strap_material = strap_material;
	}
	public String getWatch_type() {
		return watch_type;
	}
	public void setWatch_type(String watch_type) {
		this.watch_type = watch_type;
	}
	public int getWatch_warranty() {
		return watch_warranty;
	}
	public void setWatch_warranty(int watch_warranty) {
		this.watch_warranty = watch_warranty;
	}
	public String getWater_resistance() {
		return water_resistance;
	}
	public void setWater_resistance(String water_resistance) {
		this.water_resistance = water_resistance;
	}
	public String getWatch_additionalfeatures() {
		return watch_additionalfeatures;
	}
	public void setWatch_additionalfeatures(String watch_additionalfeatures) {
		this.watch_additionalfeatures = watch_additionalfeatures;
	}
	public String getWatch_batteryLife() {
		return watch_batteryLife;
	}
	public void setWatch_batteryLife(String watch_batteryLife) {
		this.watch_batteryLife = watch_batteryLife;
	}
	

}
