package com.auxgroup.jpaSample.chapter1;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringRunner;

import com.auxgroup.jpaSample.chapter1.dao.UnitDao;
import com.auxgroup.jpaSample.chapter1.domain.Unit;


@RunWith(SpringRunner.class)
@SpringBootTest()
public class BaseCURDTest {
	
	@Resource
	private UnitDao unitDao;
	
	@Test
	public void curdTest(){
		
		//delete all
		unitDao.deleteAll();
		
		//create
		Unit unit = new Unit();
		unit.setName("unit_name1");
		unitDao.save(unit);
		
		//find
		List<Unit> list = unitDao.findAll();
		
		Assert.assertEquals(1, list.size());
		
		//update
		unit.setName("newname");
		unitDao.save(unit);
		
		List<Unit> list1 = unitDao.findByName("newname");
		Unit unit1 = list1.get(0);
		
		Assert.assertEquals("newname", unit1.getName());
		Assert.assertEquals(unit.getId() , unit1.getId());
		
	}
	
	@Test
	public void JPAQueryMethodExample() {
		
		List<Unit> lists = this.unitDao.findByNameLike("java%");
		
		for (Unit unit : lists) {
			System.out.println(unit.getName());
		}
	}

}
