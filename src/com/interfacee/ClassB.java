package com.interfacee;

public class ClassB implements ClassA {

	@Override
	public void CarName() {
	System.out.println("CarName: Skoda");
		
	}

	@Override
	public void FuelType() {
	System.out.println("FuelType: Diesel");
	}

	@Override
	public void CarModel() {
    System.out.println("CarModel: 2015");
		
	}
	public static void main(String[] args) {
		ClassB c=new ClassB();
		c.CarName();
		c.FuelType();
		c.CarModel();
	}

}
