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

	@Override
	public Student saveStudent(Student s) {
		return hr.save(s);
		
	}

}
