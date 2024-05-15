package queues;

public class QueueUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		QueuesUsingArrays queue=new QueuesUsingArrays();
		int arr[]= {1,2,3,4,5};
//		for(int elem:arr) {
//			try {
//				queue.enqueue(elem);
//			} catch (QueueFullException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//		
//		
//		while(!queue.isEmpty()) {
//			try {
//				System.out.println(queue.dequeue());
//			} catch (QueueEmptyException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
//		
		
//		QueueUsingLL <Integer> queue=new QueueUsingLL<>();
		
		StackUsing2Queues stack=new StackUsing2Queues();
		
		
		for(int elem:arr) {
		
		stack.push(elem);
		}
		
		
		System.out.println(stack.top());
		
		
//		while(!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}
		
//		
//		queue.enqueue(10);
//		
//		System.out.println(queue.dequeue());
		
		

	}

}
