package prob3;

public abstract class Bird {
	
	
	protected String name;
	
	
	
	
	public abstract String toString();


	public abstract void sing();
	
	public abstract void fly();


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
