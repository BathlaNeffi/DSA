package Stacks;

public class StacksUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		// TODO Auto-generated method stub
//		StackUsingArray stack=new StackUsingArray();
		StackUsingLL<Integer> stack=new StackUsingLL<>();
		
		int arr[]= {2,4,6,4,8};
		
		for(int i:arr) {
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		
//		
//		stack.push(10);
////		stack.push(20);
////		stack.push(30);
////		stack.push(40);
//		System.out.println( stack.pop());
//		System.out.println( stack.top());
//		System.out.println( stack.size());
//		System.out.println( stack.isEmpty());
//		
		
		
		

	}

}
