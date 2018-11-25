package paint;

public class ColorPoint extends Point {
	private String color;

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
