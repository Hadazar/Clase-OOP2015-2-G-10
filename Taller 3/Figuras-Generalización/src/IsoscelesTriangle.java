public class IsoscelesTriangle {
	
	private double base;
	private double height;
	private double side1;
	private double side2;
	
	public IsoscelesTriangle(){
		base = 1;
		height = 1;
		side1 = Math.sqrt(Math.pow(height, 2)-Math.pow(base/2, 2));
		side2 = side1;
	}
	
	public void setAttributes(double side1, double side2, double base){
		if (side1 == side2 && side2 != base){this.side1 = side1;this.side2 = side2; this.height = Math.pow(side1,2) + Math.pow(base/2, 2);}
		if (side1 == base && side1 != side2){this.side1 = side1;this.side2 = side2;this.height = Math.pow(side1,2) + Math.pow(side2/2, 2);}
		if (side2 == base && side2 != side1){this.side1 = side1;this.side2 = side2;this.height = Math.pow(side2,2) + Math.pow(side1/2, 2);}
	}
	
	public double getBase(){
		return base;
	}
	
	public double getHeight(){
		return height;
	}

	public double getSide1(){
		return side1;
	}

	public double getSide2(){
		return side2;
	}
	
	public double perimeter(){
		double perimeter = 0;
		if (side1 == side2 && side2 != base){perimeter = 2 * side1 + base;}
		if (side1 == base && side1 != side2){perimeter = 2 * side2 + base;}
		if (side2 == base && side2 != side1){perimeter = 2 * side1 + base;}
		return perimeter;
	}
	
	public double area(){
		return base * height / 2;
	}
}
