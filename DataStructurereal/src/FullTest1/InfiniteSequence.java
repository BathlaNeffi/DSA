package FullTest1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class InfiniteSequence {
	public static int distance(int x, ArrayList<Integer> arrayList, int i) {
        int count = 0;
        for (int j = i-1; j > 0; j--) {
            count++;
            if (arrayList.get(j) == x) return count;
        }
        return 0;
    }

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        HashMap<Integer, Integer> hashMap = new HashMap<>();
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        arrayList.add(0);
	        for (int i = 1; i <=n; i++) {
	            int dist = distance(arrayList.get(i - 1), arrayList, i - 1);
	            arrayList.add(dist);
	            if (hashMap.containsKey(dist)) hashMap.put(dist, hashMap.get(dist) + 1);
	            else hashMap.put(dist, 1);
	        }
	        System.out.println(hashMap.get(arrayList.get(n)));
	    }

}
