package com.example.demo.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.Product;

import jakarta.transaction.Transactional;



public interface ProductRepo extends JpaRepository<Product, Integer> 
{
	Product findByOrderName(String OrderName);
	
    public List<Product> findByOrderAmount(String OrderAmount);
	
	@Query(value="select * from Product", nativeQuery= true)
	public List<Product> getAllData();
	
	@Query(value="select * from Product where Orderid=:id", nativeQuery= true)
	public List<Product> byuserid(@Param("id")int id);
	
	@Query(value="select * from Prodcut where Orderid between :start and :end",nativeQuery= true)
	public List<Product> startend(@Param("start") int start ,@Param("end") int end);
	
	@Modifying
	@Transactional
	@Query(value="delete from Product where Orderid=?1 and OrderName=?2",nativeQuery= true)
	Integer deletebyId(@Param("id") int id,@Param("name") String name);

	@Modifying
	@Transactional
	@Query(value="update Product set Orderid=:id where OrderName=:uname",nativeQuery= true)
	public Product updateDetails(@Param("id")int id,@Param("uname")String uname);
}

