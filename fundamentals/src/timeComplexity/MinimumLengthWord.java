package timeComplexity;

import java.util.Scanner;

public class MinimumLengthWord {

	public static String minLengthWord(String input) {
		input=input.trim();
		String minWord="";

		int len = input.length();
		int si = 0, ei = 0;
		int min_length = len, min_start_index = 0;

		while (ei <= len) 
		{
			if (ei < len && input.charAt(ei) != ' ')
			{
				ei++;
			} 
			else
			{

				int curr_length = ei - si;

				if (curr_length < min_length){
					min_length = curr_length;
					min_start_index = si;}


				ei++;
				si = ei;
			}
		}
		minWord = input.substring(min_start_index, min_start_index + min_length);
		return minWord;

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(minLengthWord(str));

	}

}
