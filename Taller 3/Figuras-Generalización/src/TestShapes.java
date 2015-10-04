
public class TestShapes {
	
	public static void main (String [] args){
		
		IsoscelesTriangle triangle1 = new IsoscelesTriangle();
		System.out.println("Triángulo 1:\n\n"+"Área: "+triangle1.area()+"\nPerímetro: "+triangle1.perimeter()+"\n");
		
		IsoscelesTriangle triangle2 = new IsoscelesTriangle();
		triangle2.setAttributes(5, 5, 10);
		System.out.println("Triángulo 2:\n\n"+"Área: "+triangle2.area()+"\nPerímetro: "+triangle2.perimeter()+"\n");
		
		IsoscelesTriangle triangle3 = new IsoscelesTriangle();
		triangle3.setAttributes(8, 6, 6);
		System.out.println("Triángulo 3:\n\n"+"Área: "+triangle3.area()+"\nPerímetro: "+triangle3.perimeter()+"\n");
		
		IsoscelesTriangle triangle4 = new IsoscelesTriangle();
		triangle4.setAttributes(9, 5, 2);
		System.out.println("Triángulo 4:\n\n"+"Área: "+triangle4.area()+"\nPerímetro: "+triangle4.perimeter()+"\n");
		
		IsoscelesTriangle triangle5 = new IsoscelesTriangle();
		triangle5.setAttributes(4, 4, 4);
		System.out.println("Triángulo 5:\n\n"+"Área: "+triangle5.area()+"\nPerímetro: "+triangle5.perimeter()+"\n");
		
		Parallelogram parallelogram1 = new Parallelogram();
		System.out.println("Paralelogramo 1:\n\n"+"Área: "+parallelogram1.area()+"\nPerímetro: "+parallelogram1.perimeter()+"\n");
		
		Parallelogram parallelogram2 = new Parallelogram();
		parallelogram2.setAttributes(3.6, 5, 9.4);
		System.out.println("Paralelogramo 2:\n\n"+"Área: "+parallelogram2.area()+"\nPerímetro: "+parallelogram2.perimeter()+"\n");
		
		Rectangle rectangle1 = new Rectangle();
		System.out.println("Rectágulo 1:\n\n"+"Área: "+rectangle1.area()+"\nPerímetro: "+rectangle1.perimeter()+"\n");
		
		Rectangle rectangle2 = new Rectangle();
		rectangle2.setAttributes(36, 10);
		System.out.println("Rectágulo 2:\n\n"+"Área: "+rectangle2.area()+"\nPerímetro: "+rectangle2.perimeter()+"\n");
		
		RectangleTriangle triangle6 = new RectangleTriangle();
		triangle6.setAttributes(5.2, 7.9);
		System.out.println("Triángulo 6:\n\n"+"Área: "+triangle6.area()+"\nPerímetro: "+triangle6.perimeter()+"\n");
		
		RectangleTriangle triangle7 = new RectangleTriangle();
		triangle7.setAttributes(25, 2.3);
		System.out.println("Triángulo 7:\n\n"+"Área: "+triangle7.area()+"\nPerímetro: "+triangle7.perimeter()+"\n");
	}
	;
}