package org.git;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Project {
 public static void main(String[] args) {
	 List<Integer>lis=new ArrayList<Integer>();
		
		lis.add(10);
		lis.add(23);
		lis.add(40);
		System.out.println(lis);
		

		Map<Integer,String> has = new HashMap<Integer, String>();
			has.put(10, "java");
			has.put(20, "spl" );
			has.put(30, "loop");
			has.put(40, "orcal");
			
			System.out.println(has);
	
		List<Integer>list =new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
}
}