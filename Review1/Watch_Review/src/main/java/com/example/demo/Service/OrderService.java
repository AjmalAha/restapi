package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.WatchOrder;
import com.example.demo.Repository.OrderRepo;

@Service
public class OrderService {
	@Autowired
	OrderRepo repo;

	public WatchOrder saveInfo(WatchOrder wm) {
		
		return repo.save(wm);
	}

	public List<WatchOrder> getInfo(){
		
		return repo.findAll();
	}

	public WatchOrder updateWatch(WatchOrder wn) {
		// TODO Auto-generated method stub
		return repo.saveAndFlush(wn);
	}

	public  void deleteByRequestParamId(int watchid) {
		
		 repo.deleteById(watchid);
	}
}