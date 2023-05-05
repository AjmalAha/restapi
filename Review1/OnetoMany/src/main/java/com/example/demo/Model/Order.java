package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Orderdetails")
public class Order {
	@Id
	private int Orderid;
	private String OrderName;
	private int Ordertax;
	private int OrderAmount;
	private String CustomerName;
	private String CustomerAddress;
	private String CustomerNumber;
	public int getOrderid() {
		return Orderid;
	}
	public void setOrderid(int orderid) {
		Orderid = orderid;
	}
	public String getOrderName() {
		return OrderName;
	}
	public void setOrderName(String orderName) {
		OrderName = orderName;
	}
	public int getOrdertax() {
		return Ordertax;
	}
	public void setOrdertax(int ordertax) {
		Ordertax = ordertax;
	}
	public int getOrderAmount() {
		return OrderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		OrderAmount = orderAmount;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerAddress() {
		return CustomerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}
	public String getCustomerNumber() {
		return CustomerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		CustomerNumber = customerNumber;
	}
	
	
	}
	


