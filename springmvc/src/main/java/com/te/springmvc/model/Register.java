package com.te.springmvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "Fools")
public class Register {
	@Id
	private String name;
	private String email;
	private String phoneNo;
	private String address;
}