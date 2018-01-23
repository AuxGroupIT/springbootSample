package com.auxgroup.jpaSample.chapter2;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.auxgroup.jpaSample.base.domain.Station;
import com.auxgroup.jpaSample.base.domain.User;
import com.auxgroup.jpaSample.chapter2.dao.StationDao;
import com.auxgroup.jpaSample.chapter2.dao.UserDao;
import com.auxgroup.jpaSample.chapter2.service.StationService;
import com.auxgroup.jpaSample.chapter2.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRelation {

	@Resource
	private UserService userService;
	
	@Resource
	private StationService stationService;
	
	@Resource
	private UserDao userDao;
	
	@Resource(name="chapter2Stationdao")
	private StationDao stationDao;
	
	@Test
	public void initUsers() {
		
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
	
	@Test
	@Transactional
	public void test_ONE_TO_MANY() {
		
		Station s = this.stationDao.findByName("java_engineer");
		
		//直接可以获取
		//Set<User> users = s.getUsers();
		
		Assert.assertEquals(2, s.getUsers().size());
	}
	
	
}
