package classes;

public class DynamicArrayUse {

	public static void main(String[] args) {
		DynamicArray d=new DynamicArray();
		
		for(int i=1;i<100;i++) {
			d.add(100+i);
			
		}
		System.out.println(d.size());
		System.out.println(d.get(3));
		d.set(3, 72);
		System.out.println(d.get(3));
		
//		while(!d.isEmpty()) {
//			System.out.println(d.removeLast());
//			System.out.println("size - "+ d.size());
//		}
		
		d.add(3, 30);
		
		System.out.println(d.get(3));
		System.out.println(d.get(4));
		System.out.println(d.size());
		
		
		
		
	}

}
