package com.conditional_statement;

import java.util.Scanner;

public class If_else_if_ladder {
	public static void main(String[] args) {
		Scanner mark=new Scanner(System.in);
		System.out.println("Enter yor marks");
		int Mark=mark.nextInt();
		if (Mark>35) {
			System.out.println("pass");
			}
		
		else if (Mark>=50 &&Mark<=60) {
			System.out.println("D grade");
			
		}
		else if (Mark>=61&&Mark<=70) {
			System.out.println("C grade");
			
		}
		else if (Mark>=71&&Mark<=80) {
			System.out.println("B geade");
			
		}
		else if (Mark>=81&&Mark<=90) {
			System.out.println("A grade");
			
		} else {
			System.out.println("fail");

		}
	}

}
