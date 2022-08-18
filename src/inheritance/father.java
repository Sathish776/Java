package inheritance;

public class father extends grand_father {
String FatherName="chandrasekar";
String MotherName="buvaneshwari";
public void fatherDetails() {
	System.out.println("FatherName= "+FatherName);
	System.out.println("MotherName= "+MotherName);}
	
public static void main (String[] args) {
	System.out.println("family members");
	//object syntax = classname object =new classname(); 
	father details=new father();
    details.GrandFatherDetails();
    details.fatherDetails();
	
	
	
	

}
}
