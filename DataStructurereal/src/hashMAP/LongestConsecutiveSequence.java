package hashMAP;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveSequence {

	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {

		HashMap<Integer, Boolean> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],true);
		}

		int maxLength=0;
		int start=-1;
		int end=0;

		for(int i=0; i<arr.length && map.get(arr[i]);i++){

			int startTemp=arr[i];
			int endTemp=arr[i];

			int maxLengthTemp=0;
			int j=arr[i];
			map.put(j, false);

			while(map.containsKey(j+1)) {
				map.put(j+1, false);
				maxLengthTemp++;
				endTemp=(j+1);
				j++;

			}
			j=arr[i];

			while(map.containsKey(j-1)){
				map.put(j-1, false);
				maxLengthTemp++;
				startTemp=(j-1);
				j--;
			

			}


			if(maxLengthTemp>maxLength) {
				start=startTemp;
				end=endTemp;
				maxLength=maxLengthTemp;

			}
			else if(maxLengthTemp==maxLength) {


				for(int z=0; z<arr.length;z++) {

					if(arr[z]==start) {
						break;

					}
					else if(arr[z]==startTemp) {
						start=startTemp;
						end=endTemp;

					}

				}


			}








		}


		ArrayList<Integer> output=new ArrayList<>();
		if(start<end) {
			output.add(start);
			output.add(end);
		}
		else {

			output.add(end);
			output.add(start);

		}

		return output;





	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {15,24,23,12,19,11,16};
		System.out.println(longestConsecutiveIncreasingSequence(arr));

	}

}
