package com.collection_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array_List {
	public static void main(String[] args) {
		List<String>cars=new ArrayList<>();
		cars.add("benz");
		cars.add("BMW");
		cars.add("Skoda");
		cars.add("Audi");
		cars.add("Toyata");
	
		
		System.out.println("**Size**");
		int size = cars.size();
		System.out.println(size);
		
		System.out.println("**get**");
		String get = cars.get(2);
		System.out.println(get);
		
		
		System.out.println("**index of**");
		int indexOf = cars.indexOf("Skoda");
		System.out.println(indexOf);
		
		System.out.println("**contains**");
		boolean contains = cars.contains("benz");
		System.out.println(contains);
		
		System.out.println("**set**");
		String set = cars.set(1,"Ford");
		System.out.println(set);
		
		System.out.println("** remove **");
		String remove = cars.remove(2);
		System.out.println(remove);
		
		
		
		
	}
	

}
