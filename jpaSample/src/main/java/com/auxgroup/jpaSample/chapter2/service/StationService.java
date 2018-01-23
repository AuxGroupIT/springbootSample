package com.auxgroup.jpaSample.chapter2.service;

import java.util.Set;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.auxgroup.jpaSample.base.domain.Station;
import com.auxgroup.jpaSample.base.domain.User;
import com.auxgroup.jpaSample.chapter2.dao.StationDao;

@Service
@Transactional
public class StationService {
	
	@Resource(name="chapter2Stationdao")
	private StationDao stationdao;
	
	public void saveStation(Station s) {
		this.stationdao.save(s);
	}
	
	public Set<User> getAllUsers(Station s){
		return s.getUsers();
	}
	

}
