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

import com.example.demo.SRepository.DRepository;
import com.example.demo.SService.DService;
import com.example.demo.ShoeBase.ShoeDetails;
import com.example.demo.ShoeBase.ShoeInfo;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class DController 
{
	@Autowired
	public DRepository drepo;
	
	@Autowired
	public DService dser;
	
	//Post Data
	@Tag(name = "Post Method for Shoe Details",description = "Post Validation")
	@PostMapping("/dpost")
	public ShoeDetails postInfo(@RequestBody ShoeDetails sd)
	{
		return dser.postDetails(sd);
	}
	
	//Get All details
	@Tag(name = "Get Method for Shoe Details",description = "User Validation")
	@GetMapping("/dget")
	public List<ShoeDetails> getAllInfo(ShoeDetails  sd)
	{
		return drepo.getAll();
	}
	@Tag(name = "Get by ID Method for Shoe Details",description = "Get All Details")
	@GetMapping("/dget/{id}")
	public List<ShoeDetails> getById(@PathVariable("id")int id)
	{
		return drepo.getDetailsBy(id);
	}
	
	@Tag(name = "Update by ID Method for Shoe Details",description = "Update Details")
	@PutMapping("/dput/{dname}/{id}")
	public String updateInfo(@PathVariable("dname")String dname,@PathVariable("id")int  id)
	{
		drepo.updateDetailsQuery(dname, id);
		return id+" was updated";
	}
	
	@Tag(name = "Get between two data Method for Shoe Details",description = "Get Details between two data")
	@GetMapping("/dget/{start}/{end}")
	public List<ShoeDetails> getDataBetween(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		return drepo.getDetailsBetween(start, end);
	}
	
	@Tag(name = "Delete by Id Method for Shoe Details",description = "Delete Details")
	@DeleteMapping("/ddelete/{num}")
	public String deleteData(@PathVariable("num")int num)
	{
		drepo.deleteDetails(num);
		return num+" was Deleted";
	}
	
	@Tag(name = "Get by Id Query Method for Shoe Details",description = "Get Details by Id")
	@GetMapping("/dgetquery/{type}")
	public ShoeInfo getQueryId(@PathVariable("type")String type)
	{
		return drepo.queryByTypeD(type);
	}
	
	@Tag(name = "Get by Id between two data Query Method for Shoe Details",description = "Get Details by Id between")
	@GetMapping("/dgetquery/{start}/{end}")
	public List<ShoeDetails> queryBetween(@PathVariable("start")int Start,@PathVariable("end")int end)
	{
		return drepo.betweenD(Start, end);
	}
	
	@Tag(name = "Update Data by Id Query Method for Shoe Details",description = "Update Details by Id using JPQL Query")
	@PutMapping("/dputquery/{type}/{id}")
	public String queryUpdate(@PathVariable("type")String type,@PathVariable("id")int id)	
	{
		drepo.queryUpdateDetails(type,id);
		return id+" was updated";
	}
	
	@Tag(name = "Delete by Id Query Method for Shoe Details",description = "Delete Details by Id")
	@DeleteMapping("/ddeletequery/{id}")
	public String queryDelete(@PathVariable("id")int id)
	{
		drepo.queryDeleteD(id);
		return id+" was deleted successfully";
	}
	
	@Tag(name = "Get Like Query Method for Shoe Details",description = "Get Data by Like Method")
	@GetMapping("/dlike")
	public List<ShoeDetails> queryLike()
	{
		return drepo.Dlike();
	}
}