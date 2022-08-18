package inheritance;

public class Son extends father{
String SonName1="sathish";
String SonName2="santhosh";
public void sonDetails() {
	System.out.println("SonName1= sathish");
	System.out.println("SonName2= santhosh");}
	
	public static void main(String[] args) {
	Son details=new Son();
	details.GrandFatherDetails();
	details.fatherDetails();
	details.sonDetails();
	
}
}
