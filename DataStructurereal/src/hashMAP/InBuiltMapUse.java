package hashMAP;

import java.util.HashMap;
import java.util.Set;

public class InBuiltMapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map= new HashMap<>();
		// insert 
		map.put("abc", 1);
		map.put("def", 3);
		
		//
		System.out.println(map.size());
		
		// presence
		
		if(map.containsKey("abc")) {
			System.out.println("The Map contains abc");
		}
		if(map.containsKey("abc1")) {
			System.out.println("The Map contains abc1");
		}
		// get value by key
		int v= map.get("abc");
		System.out.println(v);
		
		// explained the eception class
//		int w= map.get("abc1");
//		System.out.println(w);
		
		int w=0;
		if(map.containsKey("abc1")) {
			w=map.get("abc1");
		}
		System.out.println(w);
		
		//remove
		
//		map.remove("abc");
		if(map.containsKey("abc")) {
			System.out.println("The Map contains abc");
		}
		else {
			System.out.println("The Map does not contains abc");
		}
		
		// Iterate
		
		Set<String> key= map.keySet();
		
		for(String s: key) {
			System.out.println(s);
		}
		
		System.out.println(map.containsValue(3)); //O(n)
		
		
		
		

	}

}
