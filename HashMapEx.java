package com.hashMapDemo;

import java.util.HashMap;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		// Create hashmap
		HashMap<Integer,String> hs=new HashMap<>();
		// key and value put
		hs.put(1, "Aman");
		hs.put(2, null);
		hs.put(3,"Vishal");
		hs.put(4, "jaddu");
		hs.put(5, "Abhi");
		System.out.println("Using put method:-"+hs);
		//get method
		hs.get(2);
		System.out.println("Using get method:-"+hs);
		// remove method
		hs.remove(3);
		System.out.println("using remove method:-"+hs);
		// key contains
		System.out.println(hs.containsKey(1));
		// value contains
		System.out.println(hs.containsValue(3));
		// is empty check
		hs.isEmpty();
		System.out.println(hs);
		//size
		hs.size();
		System.out.println("Size:-"+hs);
		// clear method
		hs.clear();
		System.out.println("using clear method:-"+hs);
		
		//entry set
		System.out.println(hs.keySet());
		
		
	}
	

}
