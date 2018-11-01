package com.gjg.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gjg.bean.Info;
import com.gjg.dao.BaseDAO;
import com.gjg.mapper.InfoMapper;
import com.gjg.service.InfoService;

public class InfoServiceImpl implements InfoService {

	//����dao
	private BaseDAO  bd=new BaseDAO();
	private SqlSession session=bd.getSession();
	public void add(Info info) { 
        im.add(info);
        session.commit();//�����ύ�������spring���ɣ�����Ҫ
	} 
	public void modify(Info info) { 
		 im.modify(info);
	        session.commit();
	} 
	//             �൱��xml�ļ�ʵ���˽ӿڣ�����ָ���˷��ͣ�
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
