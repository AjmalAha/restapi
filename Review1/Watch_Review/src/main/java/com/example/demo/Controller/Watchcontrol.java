package com.example.demo.Controller;


import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.LoginModel;
import com.example.demo.Model.WatchModel;
import com.example.demo.Service.WatchServices;


@RestController
public class Watchcontrol {
	@Autowired
	WatchServices w_services;
	@PostMapping("/post")
	public String create(@RequestBody WatchModel w_model)
	{
		return w_services.addWatch(w_model);
	}
	@GetMapping("/get")
	public List<WatchModel> read()
	{
		return w_services.getWatch();
	}
	@GetMapping("get/{watch_id}")
	public Optional<WatchModel> readById(@PathVariable int watchid)
	{
		return w_services.getWatchById(watchid);
	}
	@PutMapping("/Update")
	public String update(@RequestBody WatchModel w_model)
	{
		return w_services.updateWatch(w_model);
	}
	@DeleteMapping("/Delete")
	public String delete(@RequestParam ("Wid") int watchid)
	{
		return w_services.deleteByRequestParamId(watchid);
	}
	
	//Sorting
	@GetMapping("/get/{field}")
	public List<WatchModel> getProductsSorted(@PathVariable String field)
	{
		return w_services.getSorted(field);
	}
	@GetMapping("pagination/{nm}/{sp}/{inr}")
	public List<WatchModel> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String price)
	{
		return w_services.paginate(num,size,price);
	}
	
	//Pagination
	@GetMapping("/get/{offset}/{pagesize}")
	public List<WatchModel> getProductsPagination(@PathVariable int offset, @PathVariable int pagesize)
	{
		return w_services.getWithPagination(offset, pagesize);
	}
	
	
	@PostMapping("/postlog")
	public LoginModel postLog(@RequestBody LoginModel lg)
	{
		return w_services.postLog(lg);
	}
	@GetMapping("/getlog")
	public List<LoginModel> getLog()
	{
		return w_services.getLog();
	}
	
	@GetMapping("/sort/{inr}")
	public List<WatchModel> sort(@PathVariable("inr") String price)
	{
		return w_services.sort(price);
	}
	//login
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> loginDataMap)
	{
		String loginName = loginDataMap.get("loginName");
		String loginpassword = loginDataMap.get("loginpassword");
		String result = w_services.loginCheckData(loginName, loginpassword);
		return result;
	}
}