
public class Quadrilateral {

	private double[] corner1 = new double[2];
	private double[] corner2 = new double[2];
	private double[] corner3 = new double[2];
	private double[] corner4 = new double[2];
	
	public void setAttributes (double[] corner1, double[] corner2, double[] corner3, double[] corner4){
		this.corner1 = corner1;
		this.corner2 = corner2;
		this.corner3 = corner3;
		this.corner4 = corner4;
	}
	
	public double[] getCorner1(){
		return corner1;
	}
	
	public double[] getCorner2(){
		return corner2;
	}
	
	public double[] getCorner3(){
		return corner3;
	}
	
	public double[] getCorner4(){
		return corner4;
	}
}
