package hashMAP;

import java.util.ArrayList;
import java.util.HashMap;

public class removeDuplicates {
	
	
	public static ArrayList<Integer> removeDuplicatesHelpers(int [] arr){
		
		ArrayList<Integer> output=new ArrayList<>();
		
		HashMap<Integer, Boolean> map= new HashMap<>();
		for(int i=0; i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				continue;
			}
			map.put(arr[i], true);
			output.add(arr[i]);
		}
		return output;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,2,3,2,3,5,4,4,5,3,1,6};
		
		ArrayList<Integer> output=removeDuplicatesHelpers(arr);
		
		System.out.println(output);
		
		for(int i=0; i<output.size();i++) {
			System.out.println(output.get(i));
		}

	}

}
