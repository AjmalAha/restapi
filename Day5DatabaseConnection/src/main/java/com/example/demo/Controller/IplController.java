package com.example.demo.Controller;


	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.IplModel;
import com.example.demo.Service.IplService;
	@RestController
	public class IplController {
		
		@Autowired
		public IplService iser;
		
		@PostMapping("/saveIPL")
		public IplModel addDetails(@RequestBody IplModel ia)
		{
			return iser.saveInfo(ia);
		}
		@GetMapping("/getIPL")
		public List<IplModel> getDetails()
		{
			return iser.getInfo();
			
		}
		@PutMapping("/updateIpl")
		public IplModel updateDetails(@RequestBody IplModel id)
		{
			return iser.updateInfo(id);
		}
	}


