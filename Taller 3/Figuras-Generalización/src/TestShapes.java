
public class TestShapes {
	
	public static void main (String [] args){
		
		IsoscelesTriangle triangle1 = new IsoscelesTriangle();
		System.out.println("Tri�ngulo 1:\n\n"+"�rea: "+triangle1.area()+"\nPer�metro: "+triangle1.perimeter()+"\n");
		
		IsoscelesTriangle triangle2 = new IsoscelesTriangle();
		triangle2.setAttributes(5, 5, 10);
		System.out.println("Tri�ngulo 2:\n\n"+"�rea: "+triangle2.area()+"\nPer�metro: "+triangle2.perimeter()+"\n");
		
		IsoscelesTriangle triangle3 = new IsoscelesTriangle();
		triangle3.setAttributes(8, 6, 6);
		System.out.println("Tri�ngulo 3:\n\n"+"�rea: "+triangle3.area()+"\nPer�metro: "+triangle3.perimeter()+"\n");
		
		IsoscelesTriangle triangle4 = new IsoscelesTriangle();
		triangle4.setAttributes(9, 5, 2);
		System.out.println("Tri�ngulo 4:\n\n"+"�rea: "+triangle4.area()+"\nPer�metro: "+triangle4.perimeter()+"\n");
		
		IsoscelesTriangle triangle5 = new IsoscelesTriangle();
		triangle5.setAttributes(4, 4, 4);
		System.out.println("Tri�ngulo 5:\n\n"+"�rea: "+triangle5.area()+"\nPer�metro: "+triangle5.perimeter()+"\n");
		
		Parallelogram parallelogram1 = new Parallelogram();
		System.out.println("Paralelogramo 1:\n\n"+"�rea: "+parallelogram1.area()+"\nPer�metro: "+parallelogram1.perimeter()+"\n");
		
		Parallelogram parallelogram2 = new Parallelogram();
		parallelogram2.setAttributes(3.6, 5, 9.4);
		System.out.println("Paralelogramo 2:\n\n"+"�rea: "+parallelogram2.area()+"\nPer�metro: "+parallelogram2.perimeter()+"\n");
		
		Rectangle rectangle1 = new Rectangle();
		System.out.println("Rect�gulo 1:\n\n"+"�rea: "+rectangle1.area()+"\nPer�metro: "+rectangle1.perimeter()+"\n");
		
		Rectangle rectangle2 = new Rectangle();
		rectangle2.setAttributes(36, 10);
		System.out.println("Rect�gulo 2:\n\n"+"�rea: "+rectangle2.area()+"\nPer�metro: "+rectangle2.perimeter()+"\n");
		
		RectangleTriangle triangle6 = new RectangleTriangle();
		triangle6.setAttributes(5.2, 7.9);
		System.out.println("Tri�ngulo 6:\n\n"+"�rea: "+triangle6.area()+"\nPer�metro: "+triangle6.perimeter()+"\n");
		
		RectangleTriangle triangle7 = new RectangleTriangle();
		triangle7.setAttributes(25, 2.3);
		System.out.println("Tri�ngulo 7:\n\n"+"�rea: "+triangle7.area()+"\nPer�metro: "+triangle7.perimeter()+"\n");
	}
	;
}