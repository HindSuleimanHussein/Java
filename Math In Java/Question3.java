import java.util.*;

public class Question3{

	public static void main(String[] args){
	

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to see if it's prime or not");
		int number = input.nextInt();

		boolean prime = isPrime(number);
	
		if(prime== true) {
			System.out.println("The Number You Entered Is Prime!");
				}

		else {
			System.out.println("The Number You Entered is Not Prime!");

			}

		if (number <2){
		System.exit(0);
		}
		
	}

	public static boolean isPrime(int number){

		
		boolean flag = true;
	
		for(int i=2; i<= number/2; i++)
		if (number%i == 0)
		
			return false;

		
		return true;

	}

}