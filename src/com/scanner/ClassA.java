package com.scanner;

import java.util.Scanner;

public class ClassA {
public static void main(String[] args) {
	
	Scanner hi=new Scanner(System.in); 
	
	 //Scanner syntax : scanner refname = new Scanner(System.in)
	
	System.out.println("Enter yor name");
	String Name= hi.nextLine();
	System.out.println("Welcome "+Name);
}
}
