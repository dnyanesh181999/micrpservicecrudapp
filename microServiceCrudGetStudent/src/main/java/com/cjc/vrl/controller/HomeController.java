package com.cjc.vrl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.vrl.homeservicei.HomeServicei;
import com.cjc.vrl.model.Student;

@RestController
public class HomeController {
	
	@Autowired
	HomeServicei hs;
	@GetMapping("/getById/{id}")
	public Student getById(@PathVariable int id) {
		return hs.getById(id);
	}
	@GetMapping("/getAll")
	public List<Student>getAll(){
		return hs.getAll();
	}

}
