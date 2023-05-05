package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.Order;

import jakarta.transaction.Transactional;

public interface OrderRepo extends JpaRepository<Order,Integer> 
{
	Order findByOrderName(String Ordername);
	
    public List<Order> findByOrderAmount(String OrderAmount);
	
	@Query(value="select * from Order", nativeQuery= true)
	public List<Order> getAllData();
	
	@Query(value="select * from Order where Orderid=:id", nativeQuery= true)
	public List<Order> byuserid(@Param("id")int id);
	
	@Query(value="select * from Order where Orderid between :start and :end",nativeQuery= true)
	public List<Order> startend(@Param("start") int start ,@Param("end") int end);
	
	@Modifying
	@Transactional
	@Query(value="delete from Order where Orderid=?1 and OrderName=?2",nativeQuery= true)
	Integer deletebyId(@Param("id") int id,@Param("name") String name);

	@Modifying
	@Transactional
	@Query(value="update Order set Orderid=:id where OrderName=:uname",nativeQuery= true)
	public Order updateDetails(@Param("id")int id,@Param("uname")String uname);
	

}