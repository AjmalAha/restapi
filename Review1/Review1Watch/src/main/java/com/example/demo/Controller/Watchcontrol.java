package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.WatchModel;
import com.example.demo.Services.WatchServices;

@RestController
@RequestMapping("/Watch")
public class Watchcontrol {
	@Autowired
	WatchServices w_services;
	@PostMapping(" ")
	public String create(@RequestBody WatchModel w_model)
	{
		return w_services.addWatch(w_model);
	}
	@GetMapping(" ")
	public List<WatchModel> read()
	{
		return w_services.getWatch();
	}
	@GetMapping("/{watch_id}")
	public Optional<WatchModel> readById(@PathVariable int watch_id)
	{
		return w_services.getWatchById(watch_id);
	}
	@PutMapping("/Update")
	public String update(@RequestBody WatchModel w_model)
	{
		return w_services.updateWatch(w_model);
	}
	@DeleteMapping("/Delete")
	public String delete(@RequestParam ("Wid") int watch_id)
	{
		return w_services.deleteByRequestParamId(watch_id);
	}
}
