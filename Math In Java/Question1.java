import java.util.*;
public class Question1{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("What is your weight in kilograms?");
		double weightInKilograms = input.nextDouble();
		double weightInPounds = FindPounds(weightInKilograms);

		System.out.println("What is your height in centimeters?");
		double heightInCentimeters = input.nextDouble();
		double heightInInches = FindCentimeters(heightInCentimeters);

		double BMI=0;
		BMI= weightInPounds*703/Math.pow(heightInInches, 2);

		System.out.println("Your BMI is: " + BMI);

		if(BMI>= 15 && BMI<19){
		System.out.println("You're Underweight!");
		}
		
		else if(BMI>=19 && BMI<25){
		System.out.println("You're Normal!");
		}

		else {
		System.out.println("You're Overweight!");
		}	

		input.close();

		}

	public static double FindPounds(double kilogram){

		double pounds=0;
		pounds = kilogram*2.2;
		return pounds;
		}

	public static double FindCentimeters(double centimeter){

		double inches=0;
		inches = centimeter*0.39;
		return inches;

	}

}