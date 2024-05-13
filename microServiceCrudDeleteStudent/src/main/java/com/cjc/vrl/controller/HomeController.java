package com.cjc.vrl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.vrl.homeservicei.HomeServicei;

@RestController
public class HomeController {
	
	@Autowired
	HomeServicei hs;
	public String deleteStudent(@PathVariable int id) {
		hs.deleteStudent(id);
		return "Student deleted sucessfully";
	}

}
