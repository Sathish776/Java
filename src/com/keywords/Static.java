package com.keywords;

public class Static {
static void Myname() {
	String name="sathish";
System.out.println(name);
}
static void Fathername() {
	String fname="chandrasekar";
	System.out.println(fname);
}

        //static method using without calling object direct calling

public static void main(String[] args) {
	Myname();
	Fathername();
}
}