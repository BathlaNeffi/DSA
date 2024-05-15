package Test7;

import java.util.Scanner;

public class BobAndHisString {
	
	
	public static int  BobAndString(String str) {
		
		int arr[]=new int[26];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=-1;
		}
		int max=-1;
		
		for(int i=0;i<str.length();i++) {
			if(arr[str.charAt(i)-'a']==-1) {
				arr[str.charAt(i)-'a']=i;
			}
			else {
				int ans=i-arr[str.charAt(i)-'a'] -1;
				if(ans>max) {
					max=ans;
				
					
				}
			}
			
		}
		return max;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
		String str=s.next();
		
		System.out.println(BobAndString(str));
		}
		
		
		
		
		

	}

}
