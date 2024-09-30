package com.lmsDay8;
import java.util.HashMap;

public class HashMapEmpty {
	 public static void main(String[] args) {
	        // Create a HashMap 
	        HashMap<String, Integer> map = new HashMap<>();

	        // Check if the HashMap is empty
	        if (map.isEmpty()) {
	            System.out.println("The HashMap is empty.");
	        } else {
	            System.out.println("The HashMap is not empty.");
	        }

	        // Add a key-value 
	        map.put("Aman", 25);

	        // Check again if the HashMap is empty
	        if (map.isEmpty()) {
	            System.out.println("The HashMap is empty.");
	        } else {
	            System.out.println("The HashMap is not empty.");
	        }
	    }

}
