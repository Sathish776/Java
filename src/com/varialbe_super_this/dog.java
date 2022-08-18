package com.varialbe_super_this;

public class dog extends Animal {
	public void lionSound() {
	System.out.println("the sound is ; hai lion");	
	}
	public void cowsound() {
	System.out.println("the sound is : am cow");
	}
	public void allsound() {		
		super.catsound();
		this.cowsound();
		super.lionSound();
	}
	public static void main(String[] args) {
		dog mysound=new dog();
		mysound.allsound();
	    mysound.lionSound();
	    mysound.cowsound();
		
		
	}
	
}
