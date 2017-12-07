package com.auxgroup.jpaSample.chapter2.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;

import com.auxgroup.jpaSample.chapter1.domain.IdEntity;

@Entity
@Table(name="chap2_station")
public class Station extends IdEntity{
	
	private static final long serialVersionUID = 1011518249396383864L;
	
	private String name;
	
	private Set<User> users = new HashSet<User>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany(mappedBy = "station" , cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@BatchSize(size = 50)
	public Set<User> getUsers() {
		return users;
	}
	
	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
