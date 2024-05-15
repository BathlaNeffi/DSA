package hashMAP;

import java.util.HashMap;

public class PairSumto0 {

	public static int PairSum(int[] input, int size) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */


		HashMap<Integer,Integer> map=new HashMap<>();
		int count =0;

		for(int i=0; i<size;i++) {
			
			if(map.containsKey(-input[i])) {
				int value=map.get(-input[i]);
				count+=value;
				if(map.containsKey(input[i])) {
					map.put(input[i],1+ map.get(input[i]));
				}
				else {
					map.put(input[i], 1);
				}
				
				
			}
			else {
				if(map.containsKey(input[i])) {
					map.put(input[i],1+ map.get(input[i]));
				}
				else {
					map.put(input[i], 1);
				}
			}
				
				

		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {0,0,0,0,0};

		int count=PairSum(arr, 5);
		System.out.println(count);
		String s="amit";
		int a=(int)('a'+'m'+'i'+'t');
		System.out.println(a%26);

	}

}
