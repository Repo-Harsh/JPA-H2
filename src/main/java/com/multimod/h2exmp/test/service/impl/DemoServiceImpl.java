package com.multimod.h2exmp.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multimod.h2exmp.test.entity.Student;
import com.multimod.h2exmp.test.repo.StduentRepository;
import com.multimod.h2exmp.test.service.DemoService;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	StduentRepository strepo;

	@Override
	public List<Student> getAllStudentList() {
		log.info("Exist from getAllStudentList");
		return strepo.findAll();
	}
	
	

}
