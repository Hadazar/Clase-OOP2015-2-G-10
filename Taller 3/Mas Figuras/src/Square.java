
public class Square extends Quadrilateral {

	private double side;
	
	public void setSide(){
		double[] corner_1 = getCorner1();
		double[] corner_2 = getCorner2();
		side = corner_1[0] - corner_2[0];
	}
	
	public double getSide(){
		return side;
	}
	
	public double area(){
		return side * side;
	}
}
