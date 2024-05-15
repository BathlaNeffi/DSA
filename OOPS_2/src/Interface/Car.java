package Interface;

public class Car extends Vehicle implements CarInterface ,VehicleInterface {

	@Override
	public boolean ismotarised() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getCompany() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int numGear() {
		// TODO Auto-generated method stub
		return 0;
	}

}
