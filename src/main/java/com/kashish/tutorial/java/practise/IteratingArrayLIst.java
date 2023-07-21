package com.kashish.tutorial.java.practise;

import java.util.*;

public class IteratingArrayLIst {

	public static void main(String[] args) {

		ArrayList list= new ArrayList();
		list.add("10");
		list.add("20");
		list.add(30);
		
        System.out.println(list.size());
        System.out.println("While Loop:");
        Iterator itr= list.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        System.out.println("Advanced for loop");
	    for(Object obj:list) {
	    	System.out.println(obj);
	    }
	    System.out.println("For loop:");
	    for(int i=0; i<list.size();i++) {
	    	System.out.println(list.get(i));
	    }
	}

}
