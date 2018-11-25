package paint;

public class MainApp {

	public static void main(String[] args) {
		Point pt1 = new Point();
		pt1.setX(10);
		pt1.setY(20);
		drawPoint(pt1);
		
		Point pt2 = new Point(100, 200);
		drawPoint(pt2);
		//pt2.show(false);
		
		Point pt3 = new ColorPoint();
		pt3.setX(50);
		pt3.setY(200);
		((ColorPoint)pt3).setColor("red");
		drawPoint(pt3);
		//pt3.show(true);
		//pt3.show(false);
		
		Rect rect = new Rect();
		rect.setX1(10);
		rect.setY1(10);
		rect.setX2(50);
		rect.setY2(50);
		draw(rect);
		
		Triangle triangle = new Triangle();
		draw(triangle);
		
		Circle circle = new Circle();
		draw(circle);
	}

	private static void drawPoint(Point point) {
		point.show(true);
	}

	private static void draw(Shape s) {
		s.draw();
	}
}
