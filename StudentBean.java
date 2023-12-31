package com.jspiders.springcore.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//OneToOne Mapping
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentBean {

	int id;
	String name;
	String email;
}
