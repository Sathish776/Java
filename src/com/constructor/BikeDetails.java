package com.constructor;

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
public void bike(){
	System.out.println("hai");
}


@SuppressWarnings("removal")
public static void main(String[] args) throws Throwable {

	BikeDetails s=new BikeDetails("honda");
	BikeDetails s1=new BikeDetails(2020);
	BikeDetails s2=new BikeDetails(100,12);
	s.bike();
	
	s.finalize();
	s1.finalize();
	s2.finalize();
	
	
	
}



}
