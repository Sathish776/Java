package polymorphism;

public class ClassB extends ClassA{
	/*
	 * public void StudentName(int name) { super.StudentName(name); } public void
	 * teacher(String w) { super.teacher(w); }
	 */

	/*
	 * public static void main(String[] args) { ClassB l=new ClassB();
	 * l.StudentName(30); l.teacher("edison"); }
	 */
	public static void main(String[] args) {
		String s="1234567888898";
		int indexOf = s.indexOf("9");
		System.out.println(indexOf);
		char charAt = s.charAt(11);
		System.out.println(charAt);
	}
}
