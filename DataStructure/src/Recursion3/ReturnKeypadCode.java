package Recursion3;

import java.util.HashMap;

public class ReturnKeypadCode {


	public static String[] keypad(int n,HashMap<Integer, String> map){
		// Write your code here
		if(n==0) {
			String[] str=new String[1];
			str[0]="";
			return str;
		}
		int input=n;
		String[]sol=keypad(input/10,map);
		int curr=input%10;
		String[]output= new String[map.get(curr).length()*sol.length];
		int count=0;


		for(int j=0; j<sol.length;j++) {

			for(int i=0; i<map.get(curr).length();i++) {
				

				output[count]=sol[j]+map.get(curr).charAt(i);
				count++;
			}
		}
		

		return output;



	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, null);
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(7, "pqrs");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(8, "tuv");
		map.put(9, "wxyz");
		map.put(0, null);

		String[] st=keypad(2378,map);
		int count=0;
		for(String s:st) {
			System.out.print(s+" ");
			count++;
		}
		System.out.println();
		System.out.println(count);






	}

}
