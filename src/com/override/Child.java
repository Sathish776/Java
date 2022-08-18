package com.override;

public class Child extends Parent{
	String s;
	 public void exam() {
		s=super.name;
		super.Parents();
		System.out.println(s);
	 }

	@Override
	public void properties() {
		super.properties();
	}
	@Override
	public void car() {
		super.car();
	}
	
	
	public void marriages() {
		System.out.println("my life my Rule");
	}
    public void marriage() {
	System.out.println("my life my rule");
}

	
	public static void main(String[] args) {
		Child s=new Child();
		s.properties();
		s.car();
		s.marriage();
		s.exam();
		
	}

}

