package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Model.Order;
import com.example.demo.Repository.OrderRepo;

public class Orderservice{
	@Autowired
	OrderRepo orep;
	public Order saveDetails(Order sd) 
	{
		return orep.save(sd);
	}
	public List<Order> getDetails()
	{
		return orep.findAll();
	}
	public Order updateDetails(Order cus)
	{
		return orep.saveAndFlush(cus);
	}
	public List<Order> getAllData(){
		return orep.getAllData();
	}
	public List<Order> getbyid(int id)
	{
		return orep.byuserid(id);
	}
	public List<Order> between(int start,int end)
	{
		return orep.startend(start, end);
	}
	public void deletebyidname(int id,String name)
	{
		orep.deletebyId(id, name);
	}
	public Order updatebyidname(int id,String name)
	{
		return orep.updateDetails(id, name);
	}
	public void deleteDetails(int id) {
		orep.deleteById(id);
		
	}
}


