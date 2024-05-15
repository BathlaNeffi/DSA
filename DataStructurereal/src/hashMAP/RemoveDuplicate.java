package hashMAP;

import java.util.HashMap;

public class RemoveDuplicate {
	
	public static String uniqueChar(String str){
		
		HashMap<Character, Integer> map=new HashMap<>();
		String output="";
		
		for(int i=0; i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				continue;
			}
			else {
				map.put(str.charAt(i), 1);
				output+=str.charAt(i);
			}
			
		}
		return output;
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
