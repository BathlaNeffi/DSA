package LinkList;
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner (System.in);
		String str=s.next();
		
		for(int i=0;i<Integer.MAX_VALUE;i++) {
		
		char ch=str.charAt(0+i);
		if(ch=='a') {System.out.println(i);return;}
		}
		
		
		

	}

}
