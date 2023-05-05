package com.example.demo.SController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.SRepository.IRepository;
import com.example.demo.SService.IService;
import com.example.demo.ShoeBase.ShoeInfo;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
public class IController 
{
	@Autowired
	public IRepository irepo;
	
	@Autowired
	public IService iser;
	
	@Tag(name = "Post Method for Shoe Info",description = "Post Details")
	@PostMapping("/ipost")
	public ShoeInfo postDetails(@RequestBody ShoeInfo sh)
	{
		return iser.postData(sh);
	}
	
	@Tag(name = "Get Method for Shoe Info",description = "Get All Details")
	@GetMapping("/iget")
	public List<ShoeInfo> getAllDetails(ShoeInfo si)
	{
		return irepo.getAll();
	}
	
	@Tag(name = "Get by ID Method for Shoe Info",description = "Get All Details")
	@GetMapping("/iget/{id}")
	public List<ShoeInfo> getById(@PathVariable("id")int id)
	{
		return irepo.getDataById(id);
	}
	
	@Tag(name = "Update by ID Method for Shoe Info",description = "Update Details")
	@PutMapping("/iput/{name}/{id}")
	public String updateInfo(@PathVariable("name")String name,@PathVariable("id")int  id)
	{
		irepo.updateDetails(name, id);
		return id+" was updated";
	}
	
	@Tag(name = "Get between two data Method for Shoe Info",description = "Get Details between two data")
	@GetMapping("/iget/{start}/{end}")
	public List<ShoeInfo> getDataBetween(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		return irepo.getDataBetween(start, end);
	}
	
	@Tag(name = "Delete by Id Method for Shoe Info",description = "Delete Details")
	@DeleteMapping("/idelete/{num}")
	public String deleteData(@PathVariable("num")int num)
	{
		irepo.deleteData(num);
		return num+" was Deleted";
	}
	
	@Tag(name = "Get by Id Query Method for Shoe Info",description = "Get Details by Id")
	@GetMapping("/igetquery/{colour}")
	public ShoeInfo getQueryId(@PathVariable("colour")String colour)
	{
		return irepo.queryByColour(colour);
	}
	
	@Tag(name = "Get by Id between two data Query Method for Shoe Info",description = "Get Details by Id between")
	@GetMapping("/igetquery/{start}/{end}")
	public List<ShoeInfo> queryBetween(@PathVariable("start")int Start,@PathVariable("end")int end)
	{
		return irepo.between(Start, end);
	}
	
	@Tag(name = "Update Data by Id Query Method for Shoe Info",description = "Update Details by Id using JPQL Query")
	@PutMapping("/iputquery/{colour}")
	public ShoeInfo queryUpdate(@PathVariable("colour")String colour)	
	{
		return irepo.queryByColour(colour);
	}
	
	@Tag(name = "Delete by Id Query Method for Shoe Info",description = "Delete Details by Id")
	@DeleteMapping("/ideletequery/{colour}")
	public String queryDelete(@PathVariable("colour")String colour)
	{
		irepo.queryDelete(colour);
		return colour+" was deleted successfully";
	}
	
	@Tag(name = "Get Like Query Method for Shoe Info",description = "Get Data by Like Method")
	@GetMapping("/ilike/{colour}")
	public List<ShoeInfo> queryLike(@PathVariable("colour")String colour)
	{
		return irepo.like();
	}


}