package com.jasper.model;

import java.io.Serializable;

import groovy.transform.ToString;
import lombok.Getter;
import lombok.Setter;

@ToString
@Getter
@Setter
public class City implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String stateName;
}
