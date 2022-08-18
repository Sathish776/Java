package Map_List;

import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
import java.util.Map;

public class Hash_map {
	public static void main(String[] args) {
		Map<Integer, String> cars=new HashMap<>();
		cars.put(1, "Benz");
		cars.put(2, "BMW");
		cars.put(3,"Audi");
		cars.put(4,"Ford");
		cars.put(5,"jaguar");
		
		System.out.println(cars);
		
	    System.out.println(cars.size());
	    
	    System.out.println(cars.get(4));
	    
	    System.out.println(cars.keySet());
	    
	    System.out.println(cars.values());
	    
	    System.out.println(cars.containsKey(5));
	    
	    System.out.println(cars.containsValue("BMW"));
	    
	    System.out.println(cars.entrySet());
		
		
		
		
	}

}
