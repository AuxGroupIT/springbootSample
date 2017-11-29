package com.auxgroup.jpaSample.chapter1.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	private String id;
	private String accont;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
