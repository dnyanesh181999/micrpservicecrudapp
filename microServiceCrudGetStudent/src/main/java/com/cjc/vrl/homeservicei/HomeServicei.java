package com.cjc.vrl.homeservicei;

import java.util.List;

import com.cjc.vrl.model.Student;

public interface HomeServicei {
	
	public Student getById(int id);
	public List<Student>getAll();

}
