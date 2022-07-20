package org.hcl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Sample {
	
	
public static void main(String[] args) {
	Map <Integer,String> m = new TreeMap();
	m.put(10,"ram");
	m.put(30, "sam");
	m.put(60, "jim");
	Set<Entry<Integer, String>> entrySet = m.entrySet();
		
		System.out.println(entrySet);
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
			
		}
	}
		
	}
		
	
	
	
	
	
	
	
	
	

	
	
	

	 
		   

		  








