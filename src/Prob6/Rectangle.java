package Prob6;

public class Rectangle extends Shape implements Resizable {
	
	private double w;
	private double h;
	
	public Rectangle(double w, double h) {
		
		this.w = w;
		this.h = h;
			
		
	}
	
	
	public void resize(double s) {
		
		w*=s;
		h*=s;
		
	}

	@Override
	public double getArea() {

		return w*h;
	}

	@Override
	public double getPerimeter() {

		return w+w+h+h;
	}

}
