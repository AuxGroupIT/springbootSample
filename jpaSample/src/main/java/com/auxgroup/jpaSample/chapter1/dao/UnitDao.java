package com.auxgroup.jpaSample.chapter1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auxgroup.jpaSample.chapter1.domain.Unit;

public interface UnitDao  extends JpaRepository<Unit , String>{
	
	List<Unit> findByName(String name);
	
	List<Unit> findByNameLike(String name);

}
