package com.auxgroup.jpaSample.chapter2.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.auxgroup.jpaSample.chapter1.domain.IdEntity;

@Entity
@Table(name="chap2_user")
public class User extends IdEntity{
	
	private static final long serialVersionUID = -4105391872344213193L;
	
	private String accont;
	private String name;

	public String getAccont() {
		return accont;
	}

	public void setAccont(String accont) {
		this.accont = accont;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
