package com.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class ClassB extends ClassA {
	public static void main(String[] args) {
		ClassB c=new ClassB();
		c.setStudentname("Sathish kumar");
		c.setIdno(12354);
		c.setStd("12th D");
		c.setSubject("Java");
		
		
		ClassB c1=new ClassB();
		c1.setStudentname("Santhosh");
		c1.setIdno(56484);
		c1.setStd("10th Std");
		c1.setSubject("Tamil");
		
		
		List<ClassB> l=new ArrayList<>();
		 l.add(c);
		 l.add(c1);
		 
		 for (ClassB f : l) {
			 System.out.println("Student name :"+f.getStudentname());
			 System.out.println("Studentid : "+f.getStd());
			 System.out.println("Std : "+f.getStd());
			 System.out.println("Subject : "+f.getSubject());
		}
		 
		 System.out.println("================================");
		 
		 for (int i = 0; i < l.size(); i++) {
			 System.out.println(l.get(i).getIdno());
			
		}
		
	}

}
