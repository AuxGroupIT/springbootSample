package com.auxgroup.jpaSample.chapter1;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.auxgroup.jpaSample.chapter1.domain.Station;
import com.auxgroup.jpaSample.chapter1.repostity.StationDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseCURDTest {
	
	@Resource
	private StationDao stationDao;
	
	@Test
	public void curdTest(){
		
		//delete all
		stationDao.deleteAll();
		
		//create
		Station station = new Station();
		station.setName("stationname1");
		stationDao.save(station);
		
		//find
		List<Station> list = stationDao.findAll();
		
		Assert.assertEquals(1, list.size());
		
		//update
		station.setName("newname");
		stationDao.save(station);
		
		List<Station> list1 = stationDao.findByName("newname");
		Station station1 = list1.get(0);
		
		Assert.assertEquals("newname", station1.getName());
		Assert.assertEquals(station.getId() , station1.getId());
		
	}

}
