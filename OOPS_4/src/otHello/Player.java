package otHello;

public class Player {
	private String name;
	private char symbol;

	
	public Player(String name) {
		setName(name);
	}


	private  void setName(String name) {
		// TODO Auto-generated method stub
		if(!name.isEmpty()) {
		this.name=name;	
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	
	
}