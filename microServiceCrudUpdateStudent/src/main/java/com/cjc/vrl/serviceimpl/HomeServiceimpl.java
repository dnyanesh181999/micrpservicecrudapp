package com.cjc.vrl.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.vrl.homeservicei.HomeServicei;
import com.cjc.vrl.model.Student;
import com.cjc.vrl.repository.HomeRepository;

@Service
public class HomeServiceimpl implements HomeServicei{

	@Autowired
	HomeRepository hr;
	
	public void updateStudent(Student s ) {
		hr.save(s);
	}
}
