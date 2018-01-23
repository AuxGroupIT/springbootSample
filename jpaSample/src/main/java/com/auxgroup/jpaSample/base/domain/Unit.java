package com.auxgroup.jpaSample.base.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="unit")
public class Unit extends IdEntity{
	
	private static final long serialVersionUID = 1037384314905041519L;
	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
