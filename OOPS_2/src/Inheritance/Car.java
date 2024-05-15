package Inheritance;

public abstract class  Car extends Vehicle {
	
	int noofDoors;
	private int maxSpeed;
	
//	Car(int n) {
//		super();
//		System.out.println("car");
//		noofDoors=n;
//		
//	}
	
	
	public void print() {
//		super.print();
		System.out.println("car " + "color "+ color + "  maxSpeed  "+ maxSpeed + " noofdoors "+noofDoors);
	}

@Override
public boolean ismotarised() {
	return true;
}


}
