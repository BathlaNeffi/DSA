package fundamentals;

import java.util.Scanner;

public class CheckNumberSequenceQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int prev=sc.nextInt();
		boolean isdec=true;
		int a=0;
		int b=0;
		int i=1;
		if(n==0 || n==1) {a=1;}
		while(i<=n-1) {
			int curr=sc.nextInt();
			if(prev==curr) {System.out.println("false");return;}	

			else if(prev>curr) {
				if(isdec) {prev=curr;}

				else if(b==1) {a=1;}
			}
			else if(prev<curr) {
				isdec=false;
				b=1;
				prev=curr;}
			i=i+1;
		}

			if(a==1) {System.out.println("false");}
			else {System.out.println("true");}

		}



	}




