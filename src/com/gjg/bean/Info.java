package com.gjg.bean;

import com.gjg.tool.IdCardTool;

public class Info {
	private String id;
	private String name;
	private String idcard;
	private String date;// 出生日期通过idcard计算得到
	private String gender;// 性别通过idcard计算得到
	private String phone;
	private String mark;

	public Info() {

	}

	public Info(String id, String name, String idcard, String phone, String mark) {
		super();
		this.id = id;
		this.name = name;
		this.idcard = idcard;
		this.phone = phone;
		this.mark = mark;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getDate() {
		return IdCardTool.getDate(idcard);
	}


	public String getGender() {
		return IdCardTool.getGender(idcard);
	} 

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

}
