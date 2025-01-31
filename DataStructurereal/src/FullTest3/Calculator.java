package FullTest3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(calculate(s));

	}

 static  int index = 0;
	public static int calculate(String s) {
		
		int output = 0, n = s.length();
		char operation = '+'; // default
		while(index < n) {
			
			// TO REMOVE WHITESPACE LIKE (text.contains(" ") || text.contains("\t") || text.contains("\r") 
			while(index < n && Character.isWhitespace(s.charAt(index))) {
				index++;
				System.out.print(index + " ");
			}
			

			int currNumber = 0;
			while(index < n && Character.isDigit(s.charAt(index))) {
				currNumber = (currNumber * 10) + (s.charAt(index) - '0');
				index++;
			}
			

			while(index < n && Character.isWhitespace(s.charAt(index))) {
				index++;
			}

			if(operation == '+') {
				output += currNumber;
			} else if(operation == '-'){
				output -= currNumber;
			}

			if(index < n && s.charAt(index) == '(') {
				index++;
				int evaluated = calculate(s);
				if(operation == '+') output += evaluated;
				else output -= evaluated;
			}

			if(index < n && s.charAt(index) == ')') {
				index++; // return to above level
				break;
			}

			if(index < n ) {
				operation = s.charAt(index);
			}
			index++;
		}
		return output;
	}
}
