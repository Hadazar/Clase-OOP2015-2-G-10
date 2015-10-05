
public class Trapezoid extends Quadrilateral {
	
	private double diagonal;
	private double hight1;
	private double hight2;
	
	public void setAttributes(){
		
	}

	public double getDiagonal(){
		return diagonal;
	}

	public double getHight1(){
		return hight1;
	}

	public double getHight2(){
		return hight2;
	}
	
	public double area (){
		return diagonal * hight1 / 2 + diagonal * hight2 / 2;
	}
}
