package Map_List;

import java.util.Hashtable;

public class Hashtable_ {
	public static void main(String[] args) {
		
		Hashtable<String, Integer> fuelprice=new Hashtable<>();
		fuelprice.put("Petrol",110);
		fuelprice.put("Diesel", 100);
		fuelprice.put("CNG", 48);
		
		 System.out.println(fuelprice.size());
		    
		    System.out.println(fuelprice.get(4));
		    
		    System.out.println(fuelprice.keySet());
		    
		    System.out.println(fuelprice.values());
		    
		    System.out.println(fuelprice.containsKey("Petrol"));
		    
		    System.out.println(fuelprice.containsValue(100));
		    
		    System.out.println(fuelprice.entrySet());
	}

}
