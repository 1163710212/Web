package com.gjg.service;

import java.util.List;

import com.gjg.bean.Info;

public interface InfoService {
	 public List<Info> query();//��ѯȫ��
	    
	    public void add(Info info);//��
	    public void remove(String id);//ɾ
	    
	    public Info queryById(String id);//�ȴ��޸�ǰ��ѯ
	    public void modify(Info info);//��
}
