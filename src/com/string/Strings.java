package com.string;

public class Strings {
public static void main(String[] args) {
	String s="hello java";
	System.out.println("**replace**");
	String replace = s.replace("hello","hai");
	System.out.println(replace);
	System.out.println();
	
	System.out.println("**sub string**");
	String substring = s.substring(1);
	System.out.println(substring);
	System.out.println();
	
	System.out.println("**is empty**");
	boolean empty = s.isEmpty();
	System.out.println(empty);
	System.out.println();
	
	System.out.println("**Trim**");
	String s1=" hai am sathish ";
	String trim = s1.trim();
	System.out.println(trim);
	System.out.println();
	
	System.out.print(" **Split**");
	String[] split = s1.split(" ");
	for (String Split : split) {
		System.out.println(Split);
	}
	    System.out.println();
		System.out.println("**sub string 1**");
		String substring2 = s.substring(1, 5);
		System.out.println(substring2);
		
		
	
	
	
}
}
