
public class Circle extends Shape{

	protected double radius;


	public Circle() {
		super();

	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI*Math.pow(getRadius(), 2);
	}

	@Override
	public String toString() {
		return "Circle radius=" + radius + " The Area is: " + getArea() + " Color: " + color + ". Is it Filled? " + filled;
	}






}
