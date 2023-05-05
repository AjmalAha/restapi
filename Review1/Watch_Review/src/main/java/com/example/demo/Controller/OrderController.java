package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Model.WatchOrder;
import com.example.demo.Repository.OrderRepo;
import com.example.demo.Service.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderRepo orepo;
	
	@Autowired
	public OrderService osev;
	@PostMapping("/postinggg")
	public WatchOrder create(@RequestBody WatchOrder wm)
	{
		return osev.saveInfo(wm);
	}
	@GetMapping("/getiin")
	public List<WatchOrder> getInfo()
	{
		return osev.getInfo();
	}
	@PutMapping("/Updatingg")
	public WatchOrder update(@RequestBody WatchOrder wn)
	{
		return osev.updateWatch(wn);
	}
	@DeleteMapping("/Deleteee")
	public String delete(@PathVariable ("Wid") int Orderid)
	{
		osev.deleteByRequestParamId(Orderid);
		return "Deleted";
	} 

	//Native Query
	@GetMapping("/{wide}")
		public List<WatchOrder> getOrder(@PathVariable ("Wide") int Orderid)
		{
			return orepo.getOrder(Orderid);
		}
	@DeleteMapping("/{tax}")
	public String deletebytax(@PathVariable ("tax") int Ordertax)
	{
		orepo.deletetax(Ordertax);
		 return "Deleted";
	}

	//jpql
	
	@GetMapping("/getjpql/{pr}")
	public  List<WatchOrder>  getByQuantity(@PathVariable("pr") int orderQuantity)
	{
		return orepo.getByQuantity(orderQuantity);
	}
	@DeleteMapping("/deljpql/{id}")
	public String deleteJpql(@PathVariable("id") int Orderid)
	{
		orepo.deleteJpql(Orderid);
		return "The given Id is deleted";
	}
	@PutMapping("/updatejpql/{value}/{id}")
	public  String updateDetailsQuery(@PathVariable("value") int Ordertax,@PathVariable("id") int Orderid)
	{
		orepo.updateDetailsQuery(Ordertax, Orderid);
		return "The given tax of order is updtaed";
	}
	@GetMapping("/between/{start}/{end}")
	public List<WatchOrder> getBetween (@PathVariable("start") int start,@PathVariable("end") int end)
	{
		return orepo.getBetween(start,end);
	}
	@DeleteMapping("delee")
	public String queryDeleteD(@PathVariable ("ordid")int Orderid)
	{
		orepo.queryDeleteD(Orderid);
		return "id Deleted";
	}
	@PutMapping("/dputquery/{name}/{tax}")
	public String queryUpdate(@PathVariable("name")String OrderName,@PathVariable("tax")int Ordertax)	
	{
		orepo.queryUpdateDetails(OrderName, Ordertax);
		return OrderName+" was updated";
	}

}
