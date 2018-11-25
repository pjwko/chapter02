package paint;

public class MainApp {

	public static void main(String[] args) {
		Point pt1 = new Point();
		pt1.setX(10);
		pt1.setY(20);
		draw(pt1);
		
		Point pt2 = new Point(100, 200);
		draw(pt2);
		//pt2.show(false);
		
		Point pt3 = new ColorPoint(50, 200, "red");
//		pt3.setX(50);
//		pt3.setY(200);
//		((ColorPoint)pt3).setColor("red");
		draw(pt3);
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
		// upcasting -> 암시적 캐스팅
		circle.setFillColor("yellow");
		draw(circle);
		
		Shape s = new Circle();
		// down casting -> 명시적 캐스팅
		((Circle)s).setRadius(10);
		
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Rect);
		System.out.println(s instanceof Drawable);
	
		System.out.println(circle instanceof Circle);
		//System.out.println(circle instanceof Rect);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Drawable);
		
	}

//	private static void drawPoint(Point point) {
//		point.show(true);
//	}
//
//	private static void draw(Shape s) {
//		s.draw();
//	}
	
	private static void draw(Drawable d) {
		d.draw();
	}
}
