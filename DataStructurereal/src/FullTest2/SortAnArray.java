package FullTest2;
import java.util.*;

public class SortAnArray {
	public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) == map.get(b) ? b - a: map.get(a) - map.get(b));
        for (int i = 0 ; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0 ; i < nums.length; i++) {
            pq.offer(nums[i]);
        }
        int n = nums.length;
        int [] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = pq.poll();
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
	       int n = scanner.nextInt();
	       int[] arr = new int[n];
	       for(int i =0; i<n;i++){
	           arr[i] = scanner.nextInt();
	       }
	       int[] result = frequencySort(arr);
	       for(int i = n-1; i>=0;i--){
	           System.out.print(result[i]+" ");
	       }

	}

}
