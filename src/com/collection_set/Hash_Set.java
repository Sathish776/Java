package com.collection_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hash_Set {
	public static void main(String[] args) {
		Set<String> games=new HashSet<>();
		games.add("chess");
		games.add("carrom");
		games.add("football");
		games.add("volleball");
		System.out.println(games);
		
		int size = games.size();
		System.out.println(size);
		
		boolean contains = games.contains("carrom");
		System.out.println(contains);
		
		for (String all : games) {
			System.out.println(all);
			
		}
		
		
		Set<String> games1=new HashSet<>();
		games1.add("running");
		games1.add("kabadi");
		games1.add("football");
		games1.add("volleball");
		
	//	games1.addAll(games);
	//  System.out.println(games1);
		
		games1.retainAll(games);
		System.out.println(games1);
		
		
		games.removeAll(games1);
		System.out.println(games);
		
		games.clear();
		System.out.println(games);
		
		Set<String> games2=new HashSet<>();
		games2.add("running");
		games2.add("kabadi");
		games2.add("football");
		games2.add("volleball");
		
        List<String> name=new ArrayList<>(games2);
        System.out.println(name);
        for(int i=0;i<name.size();i++) {
        	System.out.println(name.get(i));
        	
        }
        
		}
		
	}


