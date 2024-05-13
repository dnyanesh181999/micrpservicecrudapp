package com.cjc.vrl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.vrl.homeservicei.HomeServicei;
import com.cjc.vrl.model.Student;

@RestController
public class HomeController {
	@Autowired
	HomeServicei hs;
	
	@PostMapping("/saveStudent")
	public String saveStudent(@RequestBody Student s) {
		Student stu=hs.saveStudent(s);
		if(stu==null) {
		return 	"Unable to save the student";
		}
		else {
			return "Student saved sucessfully";
		}
		
	}

}
