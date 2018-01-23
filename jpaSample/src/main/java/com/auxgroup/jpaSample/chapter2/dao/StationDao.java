package com.auxgroup.jpaSample.chapter2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auxgroup.jpaSample.base.domain.Station;

@Repository(value="chapter2Stationdao")
public interface StationDao extends JpaRepository<Station , String>{
	
	Station findByName(String name);
	
}
