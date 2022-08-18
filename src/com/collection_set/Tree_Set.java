package com.collection_set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {
public static void main(String[] args) {
	Set<Object> games=new TreeSet<>();
	games.add("chess");
	games.add("carrom");
	games.add("football");
	games.add("volleball");
	games.add("adlut");
	System.out.println(games);
	
	int size = games.size();
	System.out.println(size);
	
	boolean contains = games.contains("carrom");
	System.out.println(contains);
	
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
	
}
}
