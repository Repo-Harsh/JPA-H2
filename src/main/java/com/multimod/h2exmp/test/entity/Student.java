package com.multimod.h2exmp.test.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter @Setter
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer stdId;
	
	public String stdName;
	
	public String gender;
	
	public Integer age;
	
	public Integer stdRollNum;
	
	public Date enrollDt;
	
	@JoinColumn(name="techId",unique=true)
	@OneToOne(cascade=CascadeType.ALL)
	public Teacher teacher;
	
	@JoinColumn(name="addId",unique=true)
	@OneToOne(cascade=CascadeType.ALL)
	public Address address;
	

}
