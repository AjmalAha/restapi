package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.QuestionModel;
import com.example.demo.Repository.QuestionRepository;


@RestController
@RequestMapping("/question")
public class Controller 
{

	@Autowired
	public QuestionRepository qrepo;
	
	@PostMapping("")
	public String saveDetails(@RequestBody QuestionModel q)
	{
		qrepo.save(q);
		return "Saved";
	}
	
	
}
