
public abstract class Shape implements Comparable<Shape>{

	protected String color;
	protected boolean filled;

	public Shape(){

	}

	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "Shape color=" + color + ", filled=" + filled;
	}

	public abstract double getArea();

	//public double getArea(){return 0;} <- this also works if you did not do abstract

	/*@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle)
			return this.getArea()==((Circle)obj).getArea();

		else if(obj instanceof Rectangle)
			return this.getArea()==((Rectangle)obj).getArea();


		return false;

	} correct, but not preferable */

	@Override
	public boolean equals(Object obj) {
			return this.getArea()==((Shape)obj).getArea();


	} // this is the correct way of doing equal with abstract

	public int compareTo(Shape o) {
		return (int) (this.getArea()-o.getArea());
	}






}
