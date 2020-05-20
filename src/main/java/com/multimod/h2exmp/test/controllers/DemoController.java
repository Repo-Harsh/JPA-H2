package com.multimod.h2exmp.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multimod.h2exmp.test.entity.Student;
import com.multimod.h2exmp.test.service.DemoService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping(value="/demo1")
@Log4j2
public class DemoController {
	
	@Autowired
	DemoService demoServ;
	
	@GetMapping(path="/getStudent")
	public List<Student> getStudentMapping() {
		log.info("Entring into getStudentMapping",System.currentTimeMillis());
		return demoServ.getAllStudentList();
	}

}
