
public class Rectangle extends Quadrilateral {

	private double base;
	private double hight;
	
	public void setAttributes(){
		
	}
	
	public double getBase(){
		return base;
	}
	
	public double getHight(){
		return hight;
	}
	
	public double area() {
		return base * hight;
	}
}
