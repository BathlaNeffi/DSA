package queues;

import java.util.Stack;

public class QueuesUsingStacks {
	
	Stack<Integer> s1;
	Stack<Integer> s2;
	
	public QueuesUsingStacks() {
		s1=new Stack<>();
		s2=new Stack<>();
		}
	
	public int getSize() { 
        //Implement the getSize() function
		return s1.size();
    }
	
	public boolean isEmpty() {
        //Implement the isEmpty() function
		
		return s1.isEmpty();
    }
	
	
	public void push(int element) {
        //Implement the push(element) function
		s1.push(element);
    }
	
	 public int pop() {
	        //Implement the pop() function
		 
		 while(!s1.isEmpty()) {
			 s2.push(s1.pop());
		 }
		 int j=-1;
		 if(!s2.isEmpty()) {j=s2.peek();}
		 while(!s2.isEmpty()) {
			 s1.push(s2.pop());
		 }
		 return j;
		 
	    }
	 
//	 public int top() {
//	        //Implement the top() function
//		 
//	    }
//	
	
	
	

}
