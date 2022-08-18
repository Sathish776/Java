package variables;
 
public class ClassVariable {

	 String Name="Sathesh";
	 
	 public void myname() {
		 System.out.println(Name);
	 }
	 public static void main(String[] args) {
		
		 /*create object because variable is outside the method
	       and inside the class*/
		 
		 ClassVariable name=new ClassVariable();
		 name.myname();
		 
	}
}
