public class Question4{

	public static void main(String[] args){
		for(int i=2; i<=500; i++){
		if(isPrime(i))
		System.out.println(i + " is number is prime!");
		}

		
		}

public static boolean isPrime(int number){

	
		for(int i=2; i<= number/2; i++)
		if (number%i == 0)
		
			return false;

		
		return true;

	}
			
				
}