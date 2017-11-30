package com.auxgroup.jpaSample.chapter2.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.auxgroup.jpaSample.chapter1.domain.IdEntity;

@Entity
@Table(name="chap2_station")
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
