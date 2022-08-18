package Jump_Statement;

public class While_Break {
	public static void main(String[] args) {
	int i=10;
		while (i<=20) {
			if (i==15) {
				i++;
				break;
				
			}
			System.out.println(i);
			i++;
		}
	}

}
