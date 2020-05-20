package com.multimod.h2exmp.test.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter @Setter
public class Address implements Serializable{
	
	private static final long serialVersionUID = 4L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer addId;
	
	public Integer pincode;
	
	public String street;

}
