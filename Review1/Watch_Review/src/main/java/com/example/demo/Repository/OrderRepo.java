package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.WatchOrder;

import jakarta.transaction.Transactional;

public interface OrderRepo extends JpaRepository<WatchOrder, Integer> {
	
	@Query(value="select * from orderdetails where orderid=:id",nativeQuery = true)
	public List<WatchOrder> getOrder(@Param("id") int id);
	
	@Modifying
	@Transactional
	@Query(value="delete from orderdetails where ordertax=?1",nativeQuery= true)
	public void deletetax(@Param("ordertax")int ordertax);

	

	@Modifying
	@Transactional
	@Query(value="delete from WatchOrder s where s.Orderid=:id")
	public void deleteJpql(@Param("id") int id);
	
	@Modifying
	@Transactional
	@Query(value="update WatchOrder s set s.Ordertax=:value where s.Orderid=:id",nativeQuery = true)
	public void updateDetailsQuery(@Param("value") int value,@Param("id")int id);

	@Query(value="select * from orderdetils where orderid between :start and :end",nativeQuery = true)
	public List<WatchOrder> getBetween(@Param("start") int start, @Param("end") int  end);
	
	@Modifying
	@Transactional
	@Query(value="select s from WatchOrder s where s.Orderid=?1")
	public List<WatchOrder> getByQuantity(@Param("id")int id);
	
	@Modifying
	@Transactional
	@Query(value="delete from WatchOrder i where i.Orderid=?1")
	public void queryDeleteD(@Param("orderid") int  orderid);
	
	@Modifying
	@Transactional
	@Query(value="update WatchOrder s set s.OrderName=?1 where s.Ordertax=?2")
	public void queryUpdateDetails(@Param("type")String type,@Param("id")int id);
}
