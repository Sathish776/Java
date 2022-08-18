package com.javaclass;

public class Oops {
	// method 
	//AccessSpecifier returntype methodname()
public void studentname() {
	System.out.println("Sathish");
}
	public void studentid() {
		System.out.println(392427);
	}
	public void phone_number() {
		System.out.println(8012338342L);
	}
	public void adress() {
		System.out.println("pudukkottai");
	}
	public void mail_id() {
		System.out.println("sathishkumar66.cs@gmail.com");
	}
		//main method
	public static void main(String[] args) {
		//object 
		//syntax = className ObjName=new ClassName()
		Oops s=new Oops();{
		//method calling
		s.studentname();
		s.studentid();
		s.phone_number();
		s.adress();
		s.mail_id();}
	}
			
	


}
