package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.example.demo.Model.Order;
import com.example.demo.Repository.OrderRepo;
import com.example.demo.Service.Orderservice;

@RestController
@RequestMapping
public class OrderController {
	@Autowired
	public OrderRepo repo;
	
	@Autowired
	public Orderservice dser;
	@PostMapping("")
	public Order saveDetails(@RequestBody Order cust)
	{
		return dser.saveDetails(cust);
	}
	@GetMapping("")
	public List<Order> getDetails()
	{
		return dser.getDetails();
	}
	@PutMapping("")
	public Order updateDetails(@RequestBody Order cus)
	{
		return dser.updateDetails(cus);
	}
	@DeleteMapping("/{id}")
	public String deleteDetails(@PathVariable int id)
	{
		dser.deleteDetails(id);
		return "Deleted";
	}
	@GetMapping("/getallac")
	public List<Order> getall()
	{
		return dser.getAllData();
	}
	
	@GetMapping("/getbybid/{id}")
	public List<Order> getbyid(@PathVariable int id)
	{
		return dser.getbyid(id);
	}
	
	@GetMapping("/getacbybetween/{start}/{end}")
	public List<Order> getbybetween(@PathVariable int start,@PathVariable int end)
	{
		return dser.between(start, end);
	}
	
	@DeleteMapping("/bybidname/{id}/{name}")
	public String deletebyid(@PathVariable int id,@PathVariable String name)
	{
		dser.deletebyidname(id, name);
		return "Deleted";
	}
	
	@PutMapping("/putbybidname/{id}/{name}")
	public void updatebyidname(@PathVariable int id,@PathVariable String name)
	{
		 dser.updatebyidname(id,name);
	}
	
	@Tag(name = "Get Method for CustomerInfo",description = "User Validation")
	@GetMapping("/dget")
	public List<Order> getAllInfo(Order  sd)
	{
		return repo.getAllData();
	}
	
	@Tag(name = "Post Method for CustomerInfo",description = "Post Validation")
	@PostMapping("/dpost")
	public Order postInfo(@RequestBody Order sd)
	{
		return dser.saveDetails(sd);
	}
	@Tag(name="Update method for CustomerInfo",description ="Update Validation")
	@PutMapping("/dput/{id}/{cname}")
	public Order updateInfo(@PathVariable("id")int id,@PathVariable("cname")String cname)
	{
		return dser.updatebyidname(id, cname);
	}

}

