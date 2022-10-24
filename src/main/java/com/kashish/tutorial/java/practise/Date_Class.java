package com.kashish.tutorial.java.practise;

import java.util.Date;

public class Date_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(Long.MAX_VALUE);
//System.out.println(System.currentTimeMillis());
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		System.out.println(d.getDate());
		System.out.println(d.getYear());
		System.out.println(d.getSeconds());
		System.out.println(d.getMinutes());
	}

}
