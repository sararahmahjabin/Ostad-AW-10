package AllShapes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape circle = new Circle(5.5);
		Shape square = new Square(10.0);
		Shape triangle = new Triangle(4.0, 1.5);
		
		DrawAndCalculateArea(circle);
		DrawAndCalculateArea(square);
		DrawAndCalculateArea(triangle);
		
		

	}
	
	public static void DrawAndCalculateArea(Shape shape) {
		shape.draw();
		double area = shape.calculateArea();
		System.out.println("Area: " + area);
	}

}
