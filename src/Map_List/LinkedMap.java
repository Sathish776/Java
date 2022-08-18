package Map_List;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedMap {
	public static void main(String[] args) {
		HashMap<Integer,String> Honda=new LinkedHashMap<>();
		Honda.put(1, "Unicorn");
		Honda.put(2, "Shine");
		Honda.put(3, "Activa 4G");
		Honda.put(4,"Activa 5G");
		Honda.put(5,"Dio");
		
		System.out.println(Honda);
		
		 System.out.println(Honda.size());
		    
		    System.out.println(Honda.get(4));
		    
		    System.out.println(Honda.keySet());
		    
		    System.out.println(Honda.values());
		    
		    System.out.println(Honda.containsKey(3));
		    
		    System.out.println(Honda.containsValue("Dio"));
		    
		    System.out.println(Honda.entrySet());
		
		
		
		
	}

}
