
public class Circle {
	private String color;
	private double radius;

	public Circle(String color, double radius){
		this.color=color;
		this.radius=radius;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setColor(String color){
		this.color=color;
	}
	
	public double getRadius(){
			return this.radius;
	}
	
	public void setRadius(double radius){
		try{
		this.radius=radius;
		}catch(IllegalArgumentException e){
			System.out.println("You gotta enter a double trouble, bro");
		}
	}
	
	
}
