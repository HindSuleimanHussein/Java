import java.util.*;

class SecondLabQuestion{

	public static void main(String[] args){
		double average=0, number=0, sum=0;
		Scanner input = new Scanner(System.in);
		for (int i=1; i<11; i++){
		System.out.println("Enter number " + i + " of 10 numbers");
		number=input.nextDouble();
		sum=sum+number;
		}
		average= sum/10;
		System.out.println("Average of the 10 numbers is " + average);

	}

}