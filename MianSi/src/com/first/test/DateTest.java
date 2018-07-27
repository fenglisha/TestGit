package com.first.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {

		// ��ȡ��ǰʱ��
		Date date = new Date();
		// �ַ���תʱ�� parse
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			dateFormat.parse("2017-06-16 11:03:52");

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ��ȡ��ǰʱ���ǰ����,getTIme��ms,�õ�long�����ٻ���;
		long datelong = date.getTime() - 5 * 24 * 60 * 60 * 1000;
		Date date5 = new Date(datelong);
		System.out.println(dateFormat.format(date5));
		// �ֿ��õ�ʱ���������,ֻ�����ַ�����ȡ��
		String dateString = dateFormat.format(date5);
		// "yyyy-MM-dd HH:mm:ss";substring:ȡǰ��ȡ��
		String year = dateString.substring(0, 4);
		System.out.println(year);

	}
}
