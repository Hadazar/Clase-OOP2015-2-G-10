
public class TestShapes {
	
	public static void main (String [] args){
		
		IsoscelesTriangle triangle1 = new IsoscelesTriangle();
		System.out.println("Triangle 1:\n\n"+"Area: "+triangle1.area()+"\nPerimeter: "+triangle1.perimeter()+"\n");
		
		IsoscelesTriangle triangle2 = new IsoscelesTriangle();
		triangle2.setAttributes(5, 5, 10);
		System.out.println("Triangle 2:\n\n"+"Area: "+triangle2.area()+"\nPerimeter: "+triangle2.perimeter()+"\n");
		
		IsoscelesTriangle triangle3 = new IsoscelesTriangle();
		triangle3.setAttributes(8, 6, 6);
		System.out.println("Triangle 3:\n\n"+"Area: "+triangle3.area()+"\nPerimeter: "+triangle3.perimeter()+"\n");
		
		IsoscelesTriangle triangle4 = new IsoscelesTriangle();
		triangle4.setAttributes(9, 5, 2);
		System.out.println("Triangle 4:\n\n"+"Area: "+triangle4.area()+"\nPerimeter: "+triangle4.perimeter()+"\n");
		
		IsoscelesTriangle triangle5 = new IsoscelesTriangle();
		triangle5.setAttributes(4, 4, 4);
		System.out.println("Triangle 5:\n\n"+"Area: "+triangle5.area()+"\nPerimeter: "+triangle5.perimeter()+"\n");
		
		Parallelogram parallelogram1 = new Parallelogram();
		System.out.println("Parallelogram 1:\n\n"+"Area: "+parallelogram1.area()+"\nPerimeter: "+parallelogram1.perimeter()+"\n");
		
		Parallelogram parallelogram2 = new Parallelogram();
		parallelogram2.setAttributes(3.6, 5, 9.4);
		System.out.println("Parallelogram  2:\n\n"+"Area: "+parallelogram2.area()+"\nPerimeter: "+parallelogram2.perimeter()+"\n");
		
		Rectangle rectangle1 = new Rectangle();
		System.out.println("Rectangle 1:\n\n"+"Area: "+rectangle1.area()+"\nPerimeter: "+rectangle1.perimeter()+"\n");
		
		Rectangle rectangle2 = new Rectangle();
		rectangle2.setAttributes(36, 10);
		System.out.println("Rectangle 2:\n\n"+"Area: "+rectangle2.area()+"\nPerimeter: "+rectangle2.perimeter()+"\n");
		
		RectangleTriangle triangle6 = new RectangleTriangle();
		triangle6.setAttributes(5.2, 7.9);
		System.out.println("Triangle 6:\n\n"+"Area: "+triangle6.area()+"\nPerimeter: "+triangle6.perimeter()+"\n");
		
		RectangleTriangle triangle7 = new RectangleTriangle();
		triangle7.setAttributes(25, 2.3);
		System.out.println("Triangle 7:\n\n"+"Area: "+triangle7.area()+"\nPerimeter: "+triangle7.perimeter()+"\n");
	}
	;
}