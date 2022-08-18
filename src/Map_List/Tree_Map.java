package Map_List;

import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {
	public static void main(String[] args) {
		Map<Integer, String> names=new TreeMap<>();
		names.put(1, "Sathish");
		names.put(2,"Santhosh");
		names.put(3, "manoj");
		names.put(4,"Vijay");
		
	     	System.out.println(names);

		    System.out.println(names.size());
		    
		    System.out.println(names.get(4));
		    
		    System.out.println(names.keySet());
		    
		    System.out.println(names.values());
		    
		    System.out.println(names.containsKey(5));
		    
		    System.out.println(names.containsValue("Santhosh"));
		    
		    System.out.println(names.entrySet());
		
	}

}
