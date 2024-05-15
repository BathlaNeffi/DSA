package Recursion3;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[10]; int max;// declare an array of size 10
        for(int i=0; i<10; i++) 
        {
            arr[i]=Integer.parseInt(args[i]);
        }
        	 max =arr[0]; // assume the first number as the maximum
        // compare each number with the assumed maximum and update the maximum if necessary
        for(int i=0; i<10; i++) 
        {
            if(arr[i] > max) 
            {
                max=arr[i];
            }
        }        // print the greatest number
        System.out.println("The greatest number is " + max);

	}

}
