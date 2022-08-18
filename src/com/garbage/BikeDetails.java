package com.garbage;

public class BikeDetails {
	public BikeDetails(String BikeName) {
		System.out.println("Name : "+BikeName);
	}
	public BikeDetails(int ModelYear) {
		System.out.println("year :"+ ModelYear);
	}
	public BikeDetails(int KmDriven,int month) {
	System.out.println("TotalKmDriven:"+KmDriven);
	System.out.println("ManufactureMonth :"+ month);
	}

	
	                                      //why this garbage using 
	@SuppressWarnings("removal")
	public static void main(String[] args) throws Throwable {

		BikeDetails s=new BikeDetails("Honda");
		BikeDetails s1=new BikeDetails(2020);
		BikeDetails s2=new BikeDetails(100,12);
		
		// garbage is using last stage after main method
		s.finalize();
		s1.finalize();
		s2.finalize();
		
		
	}

}
