import java.util.*;

class Question1{

	final static double PI=3.14;

	public static void main(String[] args){
		double radius;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius");
		radius = input.nextDouble();
		
		System.out.println("Area= " + getArea(radius));

		input.close();

		}

	public static double getArea(double radius){
		double area;
		area=PI*Math.pow(radius, 2);
		return area;
		}

}