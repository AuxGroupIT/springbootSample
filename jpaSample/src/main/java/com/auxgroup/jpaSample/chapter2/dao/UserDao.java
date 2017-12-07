package com.auxgroup.jpaSample.chapter2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auxgroup.jpaSample.chapter2.domain.User;

public interface UserDao extends JpaRepository<User , String>{
	
	User findByName(String name);
}
