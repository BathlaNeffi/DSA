package queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {
	
	 Queue<Integer> q1;
 Queue<Integer>  q2;
	public StackUsing2Queues() {
		q1=new LinkedList<>();
		q2=new LinkedList<>();
	}
	
	  public int getSize() { 
	        //Implement the getSize() function
		  return q1.size();
	    }
	  public boolean isEmpty() {
	        //Implement the isEmpty() function
		  return q1.isEmpty();
	    }
	  
	   public void push(int x)
      {
          // Push x first in empty q2
          q2.add(x);

          // Push all the remaining
          // elements in q1 to q2.
          while (!q1.isEmpty()) {
              q2.add(q1.peek());
              q1.remove();
          }

          // swap the names of two queues
          Queue<Integer> q = q1;
          q1 = q2;
          q2 = q;
      }

      public int pop()
      {

          // if no elements are there in q1
          if (q1.isEmpty())
              return -1;
           return q1.remove();
      }

      public int top()
      {
          if (q1.isEmpty())
              return -1;
          return q1.peek();
      }

	  
	  
	  
	  
//	  public void push(int element) {
//	        //Implement the push(element) function
//		  q1.add(element);
//	    }
//	  public int pop() {
//	        //Implement the pop() function
//		  if(q1.isEmpty()) {return -1;}
//		  while(q1.size()>1) {
//			  q2.add(q1.poll());
//		  }
//		  int j=q1.poll();
//		  
//		  while(!q2.isEmpty()) {
//			  q1.add(q2.poll());
//		  }
//		  return j;
//	    }
//	
//	  
//	  public int top() {
//	        //Implement the top() function
//		  if(q1.isEmpty()) {return -1;}
//		  while(q1.size()>1) {
//			  q2.add(q1.poll());
//		  }
//		  int j=q1.peek();
//		  
//		  while(!q2.isEmpty()) {
//			  q1.add(q2.poll());
//		  }
//		  return j;
//	    }
//		  

}
