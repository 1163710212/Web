package com.gjg.tool;

public class IdCardTool {
	public static String getDate(String idcard)
	{
		String year=idcard.substring(6, 10);
		String month=idcard.substring(10, 12);
		String day=idcard.substring(12, 14);
		return year+"��"+month+"��"+day+"��";
	}
	public static String getGender(String idcard)
	{ 
		Integer gender=Integer.parseInt(idcard.substring(16, 17));		
		return gender%2==0?"Ů":"��";
	}
}
