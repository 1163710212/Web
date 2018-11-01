package com.gjg.ui;

import java.util.List;

import com.gjg.bean.Info;
import com.gjg.service.InfoService;
import com.gjg.service.impl.InfoServiceImpl;

public class InfoManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InfoService   is=new InfoServiceImpl();
		List<Info>  infos=is.query();
        for(int i=0;i<infos.size();i++)
        {
        	Info info=infos.get(i);
        	System.out.println(info.getId()+"\t"+info.getName());
        }
	}

}
