import java.util.*;
public class Question1{

	public static void main(String[] args){
	
		System.out.println("Enter a number to find the exponential and factorial for");
		Scanner input = new Scanner(System.in);
		double number = input.nextDouble();
		
		double exponential = findExponential(number);
		long factorial = findFactorial(number);
		
		System.out.println("The exponential value of " + number + " is " + exponential);
		System.out.println("the factorial value of " + number + " is " + factorial);
		System.out.println("The true value of the exponential number is " + Math.exp(number));

	}

	public static double findExponential(double number){		
		double exp=0, sum=0;
		
		for(int i=0; i<=20; i++){
			exp= Math.pow(number, i)/findFactorial(i);
			sum+=exp;
		}

		return sum;

	}

	public static long findFactorial(double number){
		long fact=1;

		for(int i=1; i<=number; i++)
			fact*=i;

		return fact;

	}

}