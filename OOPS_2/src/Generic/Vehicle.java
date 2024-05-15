package Generic;

public class Vehicle implements PrintInterface {
	
	int maxSpeed;
	String color;
	
	Vehicle(int maxSpeed, String color){
		this.maxSpeed=maxSpeed;
		this.color=color;
	}
	
	public void print() {
		System.out.println(maxSpeed+" "+color);
	}

}
