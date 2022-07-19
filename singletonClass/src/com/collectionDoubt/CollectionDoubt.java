package com.collectionDoubt;

import java.util.HashSet;
import java.util.Set;

public class CollectionDoubt {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		selfAdd(s,"Pritam");
		selfAdd(s,"pritAm");
		System.out.println(s);
	}
	
	public static void selfAdd(Set s,String str) {
		boolean b=true;
		
		for(Object s2:s) {
			
			String s1=(String)s2;
			
			if(s1.equalsIgnoreCase(str)) {
				b=false;
			}
		}
		
		if(b) {
			s.add(str);
		}
	}
}
