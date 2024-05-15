package Generic;

public class Print {


	public static<T extends PrintInterface> void printArray(T arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i].print();
			
//			System.out.println(arr[i]);
		}
	}

	public static void main(String[] agrs) {
//		Integer arr[]=new Integer[5];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=i+1;
//		}
//		printArray(arr);
//		String arr2[]=new String[5];
//		for(int i=0;i<arr.length;i++) {
//			arr2[i]=("abc"+"a");
//		}
//
//		printArray(arr2);
		
		Vehicle v[]=new Vehicle[5];
		for(int i=0;i<v.length;i++) {
			v[i]=new Vehicle(i*100, "abc");
		}
		printArray(v);
		
	}




}
