package com.example.demo.SService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.SRepository.IRepository;
import com.example.demo.ShoeBase.ShoeInfo;


@Service
public class IService 
{
	@Autowired
	public IRepository irepo;
	
	public ShoeInfo postData(ShoeInfo sh)
	{
		return irepo.save(sh);
	}
}