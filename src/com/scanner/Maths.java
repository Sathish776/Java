package com.scanner;

import java.util.Scanner;

public class Maths {
	public static void main(String[] args) {
		Scanner maths=new Scanner(System.in);
		System.out.println("Addition");
		System.out.println("enter value A");
		int add1=maths.nextInt();
		System.out.println("enter value B");
		int add2=maths.nextInt();
		System.out.println("your answer is :"+(add1 + add2));
		
		
		System.out.println("substaction");
		System.out.println("enter valua A");
		int sub1=maths.nextInt();
		System.out.println("enter value B");
		int sub2=maths.nextInt();
		System.out.println("your answer is :"+(sub1 - sub2));
		
		
		System.out.println("multiplication");
		System.out.println("enter valua A");
		int multi1=maths.nextInt();
		System.out.println("enter value B");
		int multi2=maths.nextInt();
		System.out.println("your answer is :"+(multi1 * multi2));
		
		
		System.out.println("Division");
		System.out.println("enter valua A");
		int div1=maths.nextInt();
		System.out.println("enter value B");
		int div2=maths.nextInt();
		System.out.println("your answer is :"+(div1 * div2));
		
		
		
	}


}
