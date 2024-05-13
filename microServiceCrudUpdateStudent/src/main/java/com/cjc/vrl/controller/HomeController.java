package com.cjc.vrl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.vrl.homeservicei.HomeServicei;
import com.cjc.vrl.model.Student;

@RestController
public class HomeController {
	@Autowired
	HomeServicei hs;
	
	@PutMapping("/updateStudent")
	public String updateStudent(@RequestBody Student s ,@PathVariable int id) {
		hs.updateStudent(s);
		
		return "Data updated sucessfully";
	}

}
