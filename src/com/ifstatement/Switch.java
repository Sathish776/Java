package com.ifstatement;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);
		System.out.println("what the value in ");
		int Value=value.nextInt();
		switch (Value) {
		case 10 :
			System.out.println("a");
			break;
		case 20:
			System.out.println("b");
			break;
			case 30:
				System.out.println("c");
				break;
			case 40:
				System.out.println("d");
				break;
			

		default:
			System.out.println("incorrect");
			break;
		}
	}

}
