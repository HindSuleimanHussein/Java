import java.util.*;
public class Question1{

	public static void main(String[] args){

		    int linear=0, numbers=0;

		    Scanner in = new Scanner(System.in);
		    System.out.println("Enter the size of the array: ");
		    int size = in.nextInt();

		    int[] array = new int[size];

		    System.out.println("Enter the numbers in the array ");
		    for(int i=0; i<array.length; i++){
		    numbers = in.nextInt();
		    array[i] = numbers;
		    }

		   System.out.println("What number are you looking for?");
		   int key = in.nextInt();

		   linear = linearSearch(array, key);

		   if(linear!=-1){
			 System.out.println("The number you're searching for is " + linear);
		   }

		   else
		   System.out.println("Nope, there's no number in the array! ");

	}


	public static int linearSearch(int[] myArray, int number){

		 for(int i=0; i<myArray.length; i++){

			if(myArray[i]==number){
				return i;

			}

		 }

		return -1;


	}

}
