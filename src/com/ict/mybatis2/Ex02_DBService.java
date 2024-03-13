package com.ict.mybatis2;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Ex02_DBService {
	static private SqlSessionFactory factory;
	static String resource = "com/ict/mybatis2/ex02_config.xml";
	
	static {
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(in);
		} catch (Exception e) {
		}
	}
	
	public static SqlSessionFactory getfaFactory() {
		return factory;
	}
}
