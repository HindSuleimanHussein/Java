import java.util.*;
public class Question5{

	public static void main(String[] args){
	int number;
	for(int i=2; i<=500; i++){
		if(isPrime(i))
		System.out.println(i + " is prime!");
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number to Check or Enter -1 to Stop");
		number = input.nextInt();
		
		while(number!=-1){
			if(isPrime(number))
			System.out.println(number + " is prime!");
		
			else
			System.out.println(number + " is not prime!");
		
			System.out.println("Enter a Number to Check or Enter -1 to Stop");
			number = input.nextInt();

		} 
		
	}

	public static boolean isPrime(int number){

		for(int i=2; i<= number/2; i++)
		if (number%i == 0)
			return false;
		
		return true;

	}

}