package edu01;

import java.util.Calendar;

public class TimeChecker {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		String ampm = new String();
		
		if (hour <= 12) {
			ampm = "AM";
		}else{
			ampm = "PM";
		}
		System.out.println(ampm);
	}

}
