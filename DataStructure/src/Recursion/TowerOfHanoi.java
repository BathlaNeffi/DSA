package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	
	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
	if(disks==0) {return;}
	else if(disks==1) {System.out.println(source+" "+ destination);return;}
		towerOfHanoi(disks-1, source,destination, auxiliary);
		System.out.println(source + " "+ destination);
		towerOfHanoi(disks-1, auxiliary,source, destination);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char a='a',b='b',c='c';
		towerOfHanoi(n, a, b,c);
		

	}

}
