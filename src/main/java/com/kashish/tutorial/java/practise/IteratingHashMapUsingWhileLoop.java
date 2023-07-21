package com.kashish.tutorial.java.practise;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class IteratingHashMapUsingWhileLoop {

	public static void main(String[] args) {
	
		        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		        hashMap.put("John", 25);
		        hashMap.put("Emma", 30);
		        hashMap.put("Ryan", 28);
		        hashMap.put("Sophia", 35);

		        // Iterate using while loop
		        System.out.println("Iterating using while loop:");
		        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
		        while (iterator.hasNext()) {
		            Map.Entry<String, Integer> entry = iterator.next();
		            String key = entry.getKey();
		            Integer value = entry.getValue();
		            System.out.println(key + " - " + value);
		        }

		        // Iterate using enhanced for loop
		        System.out.println("\nIterating using enhanced for loop:");
		        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
		            String key = entry.getKey();
		            Integer value = entry.getValue();
		            System.out.println(key + " - " + value);
		        }
		    }
		}

	


