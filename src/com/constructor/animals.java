package com.constructor;

public class animals {
	
	String Animal_name;
	String Animal_type;
	String Animal_sound;
	
	public animals(String name,String type,String sound) {
		 Animal_name=name;
		 Animal_type=type;
		 Animal_sound=sound;
		 System.out.println(name);
		 System.out.println(type);
		 System.out.println(sound);
	}
		 
		 
		 
		 public static void main(String[] args) {
			 
			animals animal=new animals("Dog", "four leg", "bow");
			animals animal1=new animals("duck","two leg", "buck");
			 
		 }
		
	}


