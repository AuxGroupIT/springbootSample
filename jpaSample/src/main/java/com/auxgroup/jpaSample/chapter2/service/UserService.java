package com.auxgroup.jpaSample.chapter2.service;

import java.util.Set;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.auxgroup.jpaSample.base.domain.Station;
import com.auxgroup.jpaSample.base.domain.User;
import com.auxgroup.jpaSample.chapter2.dao.StationDao;
import com.auxgroup.jpaSample.chapter2.dao.UserDao;

@Service
@Transactional
public class UserService {

	@Resource
	private UserDao userDao;
	
	@Resource(name="chapter2Stationdao")
	private StationDao stationDao;
	
	public void saveUser(User u) {
		userDao.save(u);
	}
	
	public void saveUsers() {
		
		Station station = new Station();
		station.setName("java engineer");
		this.stationDao.save(station);
		
		User user1 = new User();
		user1.setName("Jordan");
		user1.setStation(station);
		this.userDao.save(user1);
		
		User user2 = new User();
		user2.setName("Kobe");
		user2.setStation(station);
		this.userDao.save(user2);
		
	}
	
	public void saveUsers(Set<User> users) {
		userDao.save(users);
	}
	
}
