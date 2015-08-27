package com.mt86.jweb.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mt86.jweb.common.utils.SpringContextHolder;
import com.mt86.jweb.modules.sys.entity.Area;
import com.mt86.jweb.modules.sys.service.AreaService;
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations="classpath*:/spring-context*.xml") // 加载配置
public class MybatisTest {
	
	@Autowired
	private AreaService areaService;
	/*@Test
	 public void testHello(){
		 //AreaService areaService = SpringContextHolder.getApplicationContext();
		 List<Area> areas = areaService.findAll();
		 for (Area area : areas) {
			System.out.println(area);
		}
		 ApplicationContext ct = SpringContextHolder.getApplicationContext();
	 }*/
	@Test
	 public void testkk(){
		//String resource = "classpath:/mybatis-config.xml";
		try {
			//Reader reader = Resources.getResourceAsReader(resource);
			ApplicationContext ct = SpringContextHolder.getApplicationContext();
			SqlSessionFactory sessionFactory = (SqlSessionFactory) ct.getBean("sqlSessionFactory");
			SqlSession session = sessionFactory.openSession();
			//session.selectOne("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 }
}
