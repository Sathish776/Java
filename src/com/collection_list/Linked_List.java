package com.collection_list;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {
	public static void main(String[] args) {
		List<String>cars=new LinkedList<String>();
		cars.add("benz");
		cars.add("BMW");
		cars.add("Skoda");
		cars.add("Audi");
		cars.add("Toyata");
		System.out.println(cars);
	
		
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
		System.out.println(cars);
		
		System.out.println("** remove **");
		String remove = cars.remove(2);
		System.out.println(cars);
		
		
		//cars.clear();
    	//System.out.println(cars);
		
		List<String>cars1=new LinkedList<String>();
		cars1.add("swift");
		cars1.add("honda");
		cars1.add("Audi");
		cars1.add("skoda");
		
		   //add 2 list
		/*System.out.println("**addAll**");
		cars.addAll(cars1);
		System.out.println(cars);*/
		
		   //take common value
		//cars.retainAll(cars1);
		//System.out.println(cars);
		
		// it remove common value
		cars.removeAll(cars1);
		System.out.println(cars);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	

}

}
