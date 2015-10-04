
public class Parallelogram {
	
	private double base;
	private double hight;
	private double side;
	
	public Parallelogram(){
		base = 1;
		hight = 1;
		side = 1;
	}
	
	public void setAttributes(double base, double hight, double side){
		this.base = base;
		this.hight = hight;
		this.side = side;
	}
	
	public double getBase(){
		return base;
	}
	
	
	public double getHight(){
		return hight;
	}
	
	public double getSide(){
		return side;
	}
	
	public double perimeter(){
		return 2 * side + 2 * base;
	}
	
	public double area(){
		return base * hight;
	}
}
