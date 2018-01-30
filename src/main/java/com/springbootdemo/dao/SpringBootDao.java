package com.springbootdemo.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import com.springbootdemo.entity.Student;


@Transactional
public interface SpringBootDao extends CrudRepository<Student, Serializable> {

}
