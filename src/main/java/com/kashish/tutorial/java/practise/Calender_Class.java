package com.kashish.tutorial.java.practise;

import java.util.Calendar;
import java.util.TimeZone;
public class Calender_Class {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calendar c=Calendar.getInstance();
	//	System.out.println(c.getCalendarType());
	//	System.out.println(c.getTimeZone());
		
	//	Calendar c=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
		Calendar c=Calendar.getInstance();
			System.out.println(c.getCalendarType());
			System.out.println(c.getTimeZone().getID());
			
			
	}

}
