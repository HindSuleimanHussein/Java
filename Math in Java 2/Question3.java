import java.util.*;

public class Question3{

	public static void main(String[] args){
		
		System.out.print("Enter a binary number to convert to decimal: ");
		Scanner input = new Scanner(System.in);
		int binary = input.nextInt();

		System.out.print("Enter a decimal number to convert to binary: ");
		int decimal = input.nextInt();


		int convertedDecimal = convertToDecimal(binary);
		int convertedBinary = convertToBinary(decimal);

		System.out.println("The binary number " + binary + " converted to decimal is " + convertedDecimal);
		System.out.println("The decimal number " + decimal + " converted to binary is " + convertedBinary);

	}

	public static int convertToDecimal(int binary){
		int convert=0, remainder=0, i=0;

		while(binary!=0){
			remainder=binary%10;
			convert+=remainder*Math.pow(2, i);
			binary=binary/10;
			i++;
		}

		return convert;

	}

	public static int convertToBinary(int decimal){
		int binary=0, remainder, i=0;
		

		while(decimal!=0){
			remainder=decimal%2;
			binary+=remainder*Math.pow(10, i);
			i++;

			decimal/=2;
		}
		
		return binary;
	}

}		