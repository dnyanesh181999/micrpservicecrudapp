package com.cjc.vrl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.vrl.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer>{

}
