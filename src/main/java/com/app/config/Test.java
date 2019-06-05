package com.app.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);

		JdbcTemplate jd=(JdbcTemplate)ac.getBean("jtObj");
/*
		String sql="insert into springjdbc values(?,?,?)";
		int count=jd.update(sql,10,"Dhana",347);
		System.out.println(count);
		*/
		
		
		String sql="update springjdbc set ename=?,esal=? where eid=?"; 
		 int count=jd.update(sql,"NNN",66.66,10); 
		 System.out.println(count);
		
		
	}
}
