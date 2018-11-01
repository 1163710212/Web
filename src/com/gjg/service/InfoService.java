package com.gjg.service;

import java.util.List;

import com.gjg.bean.Info;

public interface InfoService {
	 public List<Info> query();//查询全部
	    
	    public void add(Info info);//增
	    public void remove(String id);//删
	    
	    public Info queryById(String id);//等待修改前查询
	    public void modify(Info info);//改
}
