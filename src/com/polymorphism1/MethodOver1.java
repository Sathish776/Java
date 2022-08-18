package com.polymorphism1;

public class MethodOver1 {
public void Addition(int a,int b) {
	System.out.println("Addition1: "+(a+b));
}
public void Addition(int a,int b,int c) {
	System.out.println("addition2: "+( a+b+c));
}
public void Addition(long a,long b) {
	System.out.println("mobile1: " + a);
	System.out.println("mobile2: "+b);
	
}
public static void main(String[] args) {
	MethodOver1 hai=new MethodOver1();
	hai.Addition(10, 20);
	hai.Addition(10,10,20);
	hai.Addition(8012338342l, 9047120245l);
}

}
