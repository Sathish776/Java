package com.typecasting;

import java.util.Scanner;

import com.loopstatements.While_Loop;

public class demo {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int val=s.nextInt();
		int len=String.valueOf(val).length();
		int arm=0;
		int rem;
		int val1=val;
		
		
		while (val>0) {
			rem=val%10;
			arm=arm+(int)Math.pow(rem, len);
			val=val/10;
			
		}
		if (val1==arm) {
			System.out.println("its arm");
			
		}
		else {
			System.out.println("its not armstrong");
		}
	}

}
