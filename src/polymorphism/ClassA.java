package polymorphism;

public class ClassA {
	int a=10;
	static int v=20;
public void StudentName(int name) {
	int e=20;
	int c=name+a;
	int d=name-a;
	System.out.println("value 1= "+(c+d));
	System.out.println("value 2 ="+d);
	System.out.println("E value = "+e);
}

String str="hello ";
public void teacher(String na) {
	String one=str;
	String two=na;
	System.out.println(one+two);
}
public static void main(String[] args) {
	ClassA cla=new ClassA();
	cla.StudentName(20);
	cla.teacher("sathish");
}	
}