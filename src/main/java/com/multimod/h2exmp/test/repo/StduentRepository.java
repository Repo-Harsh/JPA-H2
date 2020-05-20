package com.multimod.h2exmp.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multimod.h2exmp.test.entity.Student;

public interface StduentRepository extends JpaRepository<Student,Long>{

}
