package priorityQueue;

public class priorityQueueTestMin {

	public static void main(String[] args) throws PriorityQueueException {
		// TODO Auto-generated method stub
		
		Priority_Queue<String> pq=new Priority_Queue<>();
		pq.insert("abc", 20);
		pq.insert("def", 10);
		pq.insert("xcjskls", 1);
		pq.insert("whewn", 200);
		while(!pq.isEmpty()) {
			System.out.println(pq.getMin());
			pq.removeMin();
		}
	}

}
