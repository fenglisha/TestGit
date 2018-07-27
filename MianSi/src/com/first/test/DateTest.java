package com.first.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//测试git,修改下
public class DateTest {
	public static void main(String[] args) {

		// 获取当前时间
		Date date = new Date();
		// 字符串转时间 parse
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			dateFormat.parse("2017-06-16 11:03:52");

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 获取当前时间的前五天,getTIme是ms,得到long类型再换算;
		long datelong = date.getTime() - 5 * 24 * 60 * 60 * 1000;
		Date date5 = new Date(datelong);
		System.out.println(dateFormat.format(date5));
		// 分开得到时间的年月日,只能用字符串截取；
		String dateString = dateFormat.format(date5);
		// "yyyy-MM-dd HH:mm:ss";substring:取前不取后；
		String year = dateString.substring(0, 4);
		System.out.println(year);

	}
}
