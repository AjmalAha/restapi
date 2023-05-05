
package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepo;

public class ProductService 
{
	@Autowired
	ProductRepo prep;
	public Product saveDetails(Product sd) 
	{
		return prep.save(sd);
	}
	public List<Product> getDetails()
	{
		return prep.findAll();
	}
	public Product updateDetails(Product st)
	{
		return prep.saveAndFlush(st);
	}
	public List<Product> getAllData(){
		return prep.getAllData();
	}
	public List<Product> getbyid(int id)
	{
		return prep.byuserid(id);
	}
	public List<Product> between(int start,int end)
	{
		return prep.startend(start, end);
	}
	public void deletebyidname(int id,String name)
	{
		prep.deletebyId(id, name);
	}
	public Product updatebyidname(int id,String name)
	{
		return prep.updateDetails(id, name);
	}
	public void deleteDetails(int id) {
		prep.deleteById(id);
		
	}

}
 