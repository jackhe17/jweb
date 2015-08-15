package com.mt86.jweb.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mt86.jweb.common.utils.SpringContextHolder;
import com.mt86.jweb.modules.sys.entity.Area;
import com.mt86.jweb.modules.sys.entity.User;
import com.mt86.jweb.modules.sys.service.AreaService;
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations="classpath*:/spring-context*.xml") // 加载配置
public class MybatisTest {
	
	@Autowired
	private AreaService areaService;
	 @Test
	 public void testHello(){
		 //AreaService areaService = SpringContextHolder.getApplicationContext();
		 List<Area> areas = areaService.findAll();
		/* for (Area area : areas) {
			System.out.println(area);
		}*/
		 ApplicationContext ct = SpringContextHolder.getApplicationContext();
	 }
}
