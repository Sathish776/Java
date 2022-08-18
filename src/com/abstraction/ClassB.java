package com.abstraction;     // Fully Abstraction  (or) Interface

public class ClassB extends ClassA{
	
	// in classA abstractnu ulladha eduthu method kodukanum//
	public  void Password() {
		System.out.println("********");
	}
	public static void main(String[] args) {
		ClassB s=new ClassB();
		s.UserName();
		s.UserId();
		s.Password();
	}
}