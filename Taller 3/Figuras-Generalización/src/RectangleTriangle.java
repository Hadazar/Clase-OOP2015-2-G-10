public class RectangleTriangle {
	
	private double base;
	private double height;
	private double hypotenuse;
	
	public RectangleTriangle(){
		base = 1;
		height = 1;
		hypotenuse = Math.sqrt(Math.pow(base,2)+ Math.pow(height,2));
	}
	
	public void setAttributes(double base, double height){
		this.base = base;
		this.height = height;
		this.hypotenuse = Math.sqrt(Math.pow(base,2)+ Math.pow(height,2));
	}
	
	public double getBase(){
		return base;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getHypotenuse(){
		return hypotenuse;
	}
	
	public double perimeter(){
		return base + height + hypotenuse;
	}
	
	public double area(){
		return base * height / 2;
	}
}