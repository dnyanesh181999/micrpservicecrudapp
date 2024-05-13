package com.cjc.vrl.serviceimpl;

import java.util.List;

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
	public Student getById(int id) {
		
		return hr.findById(id).get();
	}

	@Override
	public List<Student> getAll() {
		
		return (List<Student>) hr.findAll();
	}
}
