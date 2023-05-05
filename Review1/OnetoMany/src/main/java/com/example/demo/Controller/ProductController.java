package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepo;
import com.example.demo.Service.ProductService;

public class ProductController 
{
	@Autowired
	public ProductRepo srepo;
	
	@Autowired
	public ProductService ser;
	@PostMapping("")
	public Product saveDetails(@RequestBody Product sta)
	{
		return ser.saveDetails(sta);
	}
	@GetMapping("")
	public List<Product> getDetails()
	{
		return ser.getDetails();
	}
	@PutMapping("")
	public Product updateDetails(@RequestBody Product st)
	{
		return ser.updateDetails(st);
	}
	@DeleteMapping("/{id}")
	public String deleteDetails(@PathVariable int id)
	{
		ser.deleteDetails(id);
		return "Deleted";
	}
	@GetMapping("/getallac")
	public List<Product> getall()
	{
		return ser.getAllData();
	}
	
	@GetMapping("/getbybid/{id}")
	public List<Product> getbyid(@PathVariable int id)
	{
		return ser.getbyid(id);
	}
	
	@GetMapping("/getacbybetween/{start}/{end}")
	public List<Product> getbybetween(@PathVariable int start,@PathVariable int end)
	{
		return ser.between(start, end);
	}
	
	@DeleteMapping("/bybidname/{id}/{name}")
	public String deletebyid(@PathVariable int id,@PathVariable String name)
	{
		ser.deletebyidname(id, name);
		return "Deleted";
	}
	
	@PutMapping("/putbybidname/{id}/{name}")
	public void updatebyidname(@PathVariable int id,@PathVariable String name)
	{
		 ser.updatebyidname(id,name);
	}
	
	@Tag(name = "Post Method for StationInfo",description = "Post Details")
	@PostMapping("/ipost")
	public Product postDetails(@RequestBody Product sh)
	{
		return ser.saveDetails(sh);
	}
	
	@Tag(name = "Get Method for StationInfo",description = "Get All Details")
	@GetMapping("/iget")
	public List<Product> getAllDetails(Product si)
	{
		return srepo.getAllData();
	}
	
	@Tag(name = "Get by ID Method for Shoe Info",description = "Get All Details")
	@GetMapping("/iget/{id}")
	public List<Product> getById(int id)
	{
		return srepo.byuserid(id);
	}
	
	@Tag(name = "Update by ID Method for Shoe Info",description = "Update Details")
	@PutMapping("/iput/{name}/{id}")
	public Product updateInfo(@PathVariable("id")int id,@PathVariable("cname") String cname)
	{
		return srepo.updateDetails(id, cname);
	}
}
