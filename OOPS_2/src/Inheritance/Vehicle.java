package Inheritance;

public abstract class Vehicle {
	
//	public Vehicle() {
//		System.out.println("Vehicle");
////		
//	}
	
	String color;
	 protected int maxSpeed;
	
	public void print() {
		System.out.println("Vehicle " + "color "+ color + "  maxSpeed  "+ maxSpeed);
	}
	
	public abstract boolean ismotarised();



public abstract String getCompany();

}
