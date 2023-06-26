public class Question2{
	
	public static void main(String[] args){
	
		System.out.println("The perfect numbers from 1 to 1000 are: ");
		
		for(int i=1; i<=1000; i++){
			if(isPerfectNumber(i))
				System.out.println(i);
		}

	}

	public static boolean isPerfectNumber( int number){
		int sum=0;
	
		for(int i=1; i<=(number/2); i++){
			if(number%i==0)
			sum+=i;
			
		}

		if(sum==number)
		return true;
		

	return false;

	}


}