package inheritance1;

public class Signup {
	String firstname="sathish";
	String lastname="kumar";
	byte age=22;
	float mobile=8012338342f;
	String qualification="BCA";

public void Personaldetails(){
	System.out.println("PERSONAL DETAILS");
	System.out.println(firstname);
	System.out.println("lastname= kumar");
	System.out.println("age= 22");
	System.out.println("mobile= 8012338342");
	System.out.println("qualification= BCA");}
	
	public static void main(String[] args) {
		
		Signup details=new Signup();
		
		details.Personaldetails();
		
	}

	
	
	
}

