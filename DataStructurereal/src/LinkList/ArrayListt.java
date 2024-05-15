package LinkList;
import java.util.ArrayList;

public class ArrayListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(10);
		arr.add(20);
		
		arr.add(30);
		
		for(int i=0; i<arr.size();i++) {
			System.out.println(arr.get(i));
			
		}
		
		// enhanced  for loop - for each loop
//		
//		
		for(int i:arr) {
			System.out.println(i);
		}
//		System.out.println(arr.get(2));
//		arr.add(2, 40);
		Object i=30;
//		System.out.println();
		arr.remove(i);
//		
//		System.out.println(arr.size());
//		System.out.println(arr.get(1));
//		
	 System.out.println(arr.indexOf(30));

	
	}

}
