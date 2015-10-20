package edu01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Weekday {
	/**
	 * @param args
	 * @throws java.io.IOException
	 */
	public static void main(String[] args) throws java.io.IOException {
		
		System.out.println("please input a weekday in Japanese");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String weekday_ja = new String(in.readLine());

		String weekday_en = new String();
		switch(weekday_ja) {
			case "月":
				weekday_en = "Monday";
				break;
			case "火":
				weekday_en = "Tuesday";
				break;
			case "水":
				weekday_en = "Wednesday";
				break;
			case "木":
				weekday_en = "Thursday";
				break;
			case "金":
				weekday_en = "Friday";
				break;
			case "土":
				weekday_en = "Saturday";
				break;
			case "日":
				weekday_en = "Sunday";
				break;
		}
		System.out.println(weekday_en);
	}

}
