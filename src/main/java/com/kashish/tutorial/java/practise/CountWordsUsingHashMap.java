package com.kashish.tutorial.java.practise;

import java.util.HashMap;

public class CountWordsUsingHashMap {

	public static void main(String[] args) {

		String s="Who You Is Who Is Is That";
		String[] split= s.split(" ");
		
		HashMap<String,Integer> map =new HashMap<String,Integer>();
		for(int i=0; i<split.length; i++) {
			if(map.containsKey(split[i])) {
				int count=map.get(split[i]);
				map.put(split[i], count+1);
			}
			else {
				map.put(split[i], 1);
			}
				
		}
		System.out.println(map);
		
	}

}
