package com.first.test;

//jjjj
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//jjjj
//111
//111
public class DateTest {
	public static void main(String[] args) {

		// 鑾峰彇褰撳墠鏃堕棿
		Date date = new Date();
		// 瀛楃涓茶浆鏃堕棿 parse
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			dateFormat.parse("2017-06-16 11:03:52");

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 鑾峰彇褰撳墠鏃堕棿鐨勫墠浜斿ぉ,getTIme鏄痬s,寰楀埌long绫诲瀷鍐嶆崲绠�;
		long datelong = date.getTime() - 5 * 24 * 60 * 60 * 1000;
		Date date5 = new Date(datelong);
		System.out.println(dateFormat.format(date5));
		// 鍒嗗紑寰楀埌鏃堕棿鐨勫勾鏈堟棩,鍙兘鐢ㄥ瓧绗︿覆鎴彇锛�
		String dateString = dateFormat.format(date5);
		// "yyyy-MM-dd HH:mm:ss";substring:鍙栧墠涓嶅彇鍚庯紱
		String year = dateString.substring(0, 4);
		System.out.println(year);

	}
}
