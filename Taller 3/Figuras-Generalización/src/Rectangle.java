
public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle(){
		length = 1;
		width = 1;
	}
	
	public void setAttributes(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	public double getLength(){
		return length;
	}
	
	public double getWidth(){
		return width;
	}
	
	public double perimeter(){
		return 2 * length + 2 * width;
	}
	
	public double area(){
		return length * width;
	}
	
}