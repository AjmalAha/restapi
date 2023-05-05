package com.example.demo.SRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.ShoeBase.ShoeDetails;
import com.example.demo.ShoeBase.ShoeInfo;

import jakarta.transaction.Transactional;

public interface DRepository extends JpaRepository<ShoeDetails, Integer> 
{
		//Get All Data
		@Query(value="select * from shoe_details",nativeQuery = true)
		public List<ShoeDetails> getAll();
	
	    //Get one particular data
		@Query(value="select * from shoe_details where shoeid=:id",nativeQuery = true)
		public List<ShoeDetails> getDetailsBy(@Param("id")int id);
		
		//Get between two data
		@Query(value="select * from shoe_details where shoeid between :start and :end",nativeQuery = true)
		public List<ShoeDetails> getDetailsBetween(@Param("start")int start,@Param("end")int end);
		
		//Delete By ID
		@Modifying
		@Transactional
		@Query(value="delete from shoe_details where shoeid=:num",nativeQuery = true)
		public void deleteDetails(@Param("num")int num);
		
		//Update Data
		@Modifying
		@Transactional
		@Query(value="update shoe_details set shoebrand=:value where shoeid=:id",nativeQuery = true)
		public void updateDetailsQuery(@Param("value")String value,@Param("id")int id);
		
		//JPQL QUERY STATEMENT
		
		//Get By ID
		@Query("select i from ShoeDetails i where i.shoetype=?1")
		public ShoeInfo queryByTypeD(@Param("type")String type);
		
		//Get Between
		@Query("select i from ShoeDetails i where i.shoeid between ?1 and ?2")
		public List<ShoeDetails> betweenD(@Param("start")int start,@Param("end")int end);
		
		//Get method using like
		@Query(value="select s from ShoeDetails s where s.shoebrand like 'T%'")
		public List<ShoeDetails> Dlike();
		
		//Update using JPQL Query
		@Modifying
		@Transactional
		@Query(value="update ShoeDetails s set s.shoetype=?1 where s.shoeid=?2")
		public void queryUpdateDetails(@Param("type")String type,@Param("id")int id);
		
		//Delete using JPQL Query
		@Modifying
		@Transactional
		@Query(value="delete from ShoeDetails i where i.shoeid=?1")
		public void queryDeleteD(@Param("id")int id);
}