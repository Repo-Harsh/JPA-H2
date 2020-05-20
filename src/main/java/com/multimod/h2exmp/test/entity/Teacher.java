package com.multimod.h2exmp.test.entity;

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
public class Teacher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer techId;
	
	public String techName;
	
	public String gender;
	
	public Integer age;
	
	@JoinColumn(name="addId",unique=true)
	@OneToOne(cascade=CascadeType.ALL)
	public Address address;

}
