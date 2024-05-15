package FullTest1;

import java.util.*;
import java.lang.*;
import java.io.*;
public class JumpingNumbers {

	public static void breathFirstSearch(int x, int num) {

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(num);
		while (!queue.isEmpty()) {
			num = queue.peek();
			queue.poll();
			if (num <= x) {

				System.out.print(num + " ");
				int last_digit = num % 10;

				if (last_digit == 0) {

					queue.add((num * 10) + (last_digit + 1));
				}

				else if (last_digit == 9) {

					queue.add((num * 10) + (last_digit - 1));
				}
				else {

					queue.add((num * 10) + (last_digit + 1));
					queue.add((num * 10) + (last_digit - 1));
				}
			}
		}
	}
	public static void showJumpingNos(int x) {
		System.out.print("0 ");

		for (int i = 1; i <= 9 && i <= x; i++) {

			breathFirstSearch(x, i);
		}
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner (System.in);
		int x=s.nextInt();
		showJumpingNos(x);

	}

}
