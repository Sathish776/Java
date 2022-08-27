package com.loopstatements;

import java.util.Iterator;

public class Nested1 {
	public static void main(String[] args) {
		for (int i = 0; i <=10; i++) {
			for (int j = 5; j >= i; j++) {
				System.out.print("*");
			
			}
			System.out.println();
			
		}
	}

}
