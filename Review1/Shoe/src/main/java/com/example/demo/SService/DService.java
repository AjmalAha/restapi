package com.example.demo.SService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.SRepository.DRepository;
import com.example.demo.ShoeBase.ShoeDetails;

@Service
public class DService 
{
	@Autowired
	public DRepository drepo;
	
	public ShoeDetails postDetails(ShoeDetails sd)
	{
		return drepo.save(sd);
	}
}