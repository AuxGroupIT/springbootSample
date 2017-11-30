package com.auxgroup.jpaSample.chapter1.repostity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auxgroup.jpaSample.chapter1.domain.Station;

public interface StationDao extends JpaRepository<Station , String>{
	
	List<Station> findByName(String name);

}
