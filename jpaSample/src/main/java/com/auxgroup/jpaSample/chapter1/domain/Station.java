package com.auxgroup.jpaSample.chapter1.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="station")
public class Station extends IdEntity{
	
	private static final long serialVersionUID = 1011518249396383864L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
