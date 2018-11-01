package com.gjg.dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BaseDAO {
	public static void main(String[] args) {
		new BaseDAO().getSession();
	}
    public SqlSession getSession()
    {
    	SqlSession   session=null;
    	String resource = "com/gjg/config/mybatis-config.xml";
		try { 
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory =
				new SqlSessionFactoryBuilder().build(inputStream);
			session=sqlSessionFactory.openSession(); 
			//System.out.println("获取mybatis session成功");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
    	return session;
    }
}
