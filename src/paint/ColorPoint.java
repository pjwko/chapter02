package paint;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		// super();
		
		//setX(x);
		//setY(y);
		super(x, y);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
		//super.show();
		System.out.println(
				"점 [x=" + 
				getX() + ",y=" + 
				getY() + ",color=" +
				color  + "] 그렸습니다.");		
	}
	
	
}
