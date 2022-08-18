package com.constructor;

public class calculate {

	int a;
	byte b;
	byte c;
	public calculate(int value1,int value2) {
		a=value1;
		b=(byte) value2;
	}
	public calculate(int value1,byte value2) {
		a=value1;
		b=value2;
		
	}
	public  void addition() {
		System.out.println(a+b);
	}
		public void substraction() {
			System.out.println("subraction is "+ (a-b));
		}
		
	
	
	public static void main(String[] args) {
		calculate add=new calculate(20,10);
		calculate add2=new calculate(10, 3);
		add.addition();
		add.substraction();
	}
}
