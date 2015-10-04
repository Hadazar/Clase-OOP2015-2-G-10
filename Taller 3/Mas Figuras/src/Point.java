
public class Point {
	
	public static void main (String[] args){
		
		Quadrilateral Quadrilateral1 = new Quadrilateral();
		double[] corner_1 = {1.1,1.2};
		double[] corner_2 = {6.6,2.8};
		double[] corner_3 = {6.2,9.9};
		double[] corner_4 = {2.2,7.4};
		Quadrilateral1.setAttributes(corner_1,corner_2 ,corner_3 ,corner_4);
		
		Trapezoid Trapezoid1 = new Trapezoid();
		double[] corner_5 = {0,0};
		double[] corner_6 = {10,0};
		double[] corner_7 = {8,5};
		double[] corner_8 = {3.3,5};
		Trapezoid1.setAttributes(corner_5,corner_6 ,corner_7 ,corner_8);
		
		Parallelogram Parallelogram1 = new Parallelogram();
		double[] corner_9 = {5,5};
		double[] corner_10 = {11,5};
		double[] corner_11 = {12,20};
		double[] corner_12 = {6,20};
		Parallelogram1.setAttributes(corner_9,corner_10 ,corner_11 ,corner_12);
		
		Rectangle Rectangle1 = new Rectangle();
		double[] corner_13 = {17,14};
		double[] corner_14 = {30,14};
		double[] corner_15 = {30,28};
		double[] corner_16 = {17,28};
		Rectangle1.setAttributes(corner_13,corner_14 ,corner_15 ,corner_16);
		
		Square Square1 = new Square();
		double[] corner_17 = {4,0};
		double[] corner_18 = {8,0};
		double[] corner_19 = {8,4};
		double[] corner_20 = {4,4};
		Square1.setAttributes(corner_17,corner_18 ,corner_19 ,corner_20);
	}
}
