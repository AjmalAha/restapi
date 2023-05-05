package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="details")
public class WatchModel {
		@Id
		private int watchid;
		private String watchmodel;
		private String watchcompany;
		private String watchcolour;
		private int watchprice;
		private String strapmaterial;
		private String watchtype;
		private int watchwarranty;
		private String waterresistance;
		private String watchadditionalfeatures;
		private String watchbatteryLife;

		public int getWatchid() {
			return watchid;
		}
		public void setWatchid(int watchid) {
			this.watchid = watchid;
		}
		public String getWatchmodel() {
			return watchmodel;
		}
		public void setWatchmodel(String watchmodel) {
			this.watchmodel = watchmodel;
		}
		public String getWatchcompany() {
			return watchcompany;
		}
		public void setWatchcompany(String watchcompany) {
			this.watchcompany = watchcompany;
		}
		public String getWatchcolour() {
			return watchcolour;
		}
		public void setWatchcolour(String watchcolour) {
			this.watchcolour = watchcolour;
		}
		public int getWatchprice() {
			return watchprice;
		}
		public void setWatchprice(int watchprice) {
			this.watchprice = watchprice;
		}
		public String getStrapmaterial() {
			return strapmaterial;
		}
		public void setStrapmaterial(String strapmaterial) {
			this.strapmaterial = strapmaterial;
		}
		public String getWatchtype() {
			return watchtype;
		}
		public void setWatchtype(String watchtype) {
			this.watchtype = watchtype;
		}
		public int getWatchwarranty() {
			return watchwarranty;
		}
		public void setWatchwarranty(int watchwarranty) {
			this.watchwarranty = watchwarranty;
		}
		public String getWaterresistance() {
			return waterresistance;
		}
		public void setWaterresistance(String waterresistance) {
			this.waterresistance = waterresistance;
		}
		public String getWatchadditionalfeatures() {
			return watchadditionalfeatures;
		}
		public void setWatchadditionalfeatures(String watchadditionalfeatures) {
			this.watchadditionalfeatures = watchadditionalfeatures;
		}
		public String getWatchbatteryLife() {
			return watchbatteryLife;
		}
		public void setWatchbatteryLife(String watchbatteryLife) {
			this.watchbatteryLife = watchbatteryLife;
		}
		
}
		
		