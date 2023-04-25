package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.WatchModel;
import com.example.demo.Repository.WatchRepo;

@Service
public class WatchServices {
	@Autowired
	WatchRepo w_repo;
	public String addWatch(WatchModel w_model)
	{
		w_repo.save(w_model);
		return "Added !";
	}
	public List<WatchModel> getWatch()
	{
		return w_repo.findAll();
	}
	public Optional<WatchModel> getWatchById(int id)
	{
		return w_repo.findById(id);
	}
	public String updateWatch(WatchModel w_model)
	{
		w_repo.save(w_model);
		return "Updated ";
	}
	public String deleteByRequestParamId(int id)
	{
		w_repo.deleteById(id);
		return "Deleted ";
	}
}
