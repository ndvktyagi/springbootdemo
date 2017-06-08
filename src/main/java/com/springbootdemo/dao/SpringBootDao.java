package com.springbootdemo.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootdemo.entity.SpringBoot;
import com.springbootdemo.entity.Student;


@Repository
public class SpringBootDao implements CrudRepository<Student, Serializable> {
	
	
	public String getSprintBootMsg(){
		
		return new SpringBoot().getBootMsg();
	}
	
	
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(Serializable arg0) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Student arg0) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Iterable<? extends Student> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public boolean exists(Serializable arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<Student> findAll(Iterable<Serializable> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student findOne(Serializable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Student> Iterable<S> save(Iterable<S> student) {
		return student;
	}


	public <S extends Student> S save(S student) {
		return student;
	}


}
