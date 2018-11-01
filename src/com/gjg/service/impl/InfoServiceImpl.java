package com.gjg.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gjg.bean.Info;
import com.gjg.dao.BaseDAO;
import com.gjg.mapper.InfoMapper;
import com.gjg.service.InfoService;

public class InfoServiceImpl implements InfoService {

	//引用dao
	private BaseDAO  bd=new BaseDAO();
	private SqlSession session=bd.getSession();
	public void add(Info info) { 
        im.add(info);
        session.commit();//必须提交，如果是spring集成，则不需要
	} 
	public void modify(Info info) { 
		 im.modify(info);
	        session.commit();
	} 
	//             相当于xml文件实现了接口（参数指定了泛型）
	InfoMapper  im=session.getMapper(InfoMapper.class);
	public List<Info> query() {
		return im.query();
	} 
	public Info queryById(String id) { 
		return im.queryById(id);
	}

	public void remove(String id) {
		 im.remove(id);
	        session.commit();

	}

}
