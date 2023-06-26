import java.util.*;

public class Question1 {
	
	public static void main(String[] args){
		
		try{
		System.out.print("Enter a binary number to convert to decimal: ");
		Scanner input = new Scanner(System.in);
		String binary = input.next();

		int convertedDecimal = convertToDecimal(binary);
		
		System.out.println("The binary number " + binary + " converted to decimal is " + convertedDecimal);
		}catch(NumberFormatException e){ 
			System.out.println("You have to enter a string, you entered " + e);
		}
	}

	public static int convertToDecimal(String binary){

		return Integer.parseInt(binary, 2);

	}
}

