package com.scanner;

import java.util.Scanner;

public class ClassB {
public static void main(String[] args) {
	Scanner h=new Scanner(System.in);
	System.out.println("Enter Your First Name :");
	String Firstname=h.next();
	System.out.println("FirstName :"+Firstname);
	
	System.out.println("Enter your LastName :");
	String Lastname=h.next();
	System.out.println("last name :"+Lastname);
	
	System.out.println("enter your year of birth");
	int year=h.nextInt();
	System.out.println("year :"+year);
	
	System.out.println("enter your salary");
	int salary=h.nextInt();
	System.out.println("salary :"+salary);
	
	System.out.println("enter your mobile");
    long mobile=h.nextLong();
	System.out.println("youe mobile is :"+mobile);
	
	System.out.println("enter time now");
	double time=h.nextDouble();
	System.out.println("the time now is :"+time);
	
	System.out.println("enter the department");
	String dep=h.next().toString();
	System.out.println("your dep is :"+dep);
	
	System.out.println("enter the sec");
	char sec=h.next().charAt(0);
	System.out.println(sec);
	
	System.out.println("say");
	boolean say=h.nextBoolean();
	System.out.println(say);
}
}
