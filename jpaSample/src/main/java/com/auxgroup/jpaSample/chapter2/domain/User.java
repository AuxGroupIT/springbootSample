package com.auxgroup.jpaSample.chapter2.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.auxgroup.jpaSample.chapter1.domain.IdEntity;

@Entity
@Table(name="chap2_user")
public class User extends IdEntity{
	
	private static final long serialVersionUID = -4105391872344213193L;
	
	private String name;
	
	private Station station;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToOne(cascade = {CascadeType.ALL} , fetch = FetchType.LAZY)
    @JoinColumn(name = "station_id")
	public Station getStation() {
		return station;
	}
	
	public void setStation(Station station) {
		this.station = station;
	}
	

}
