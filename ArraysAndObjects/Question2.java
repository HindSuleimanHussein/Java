import java.util.*;

public class Question2{

	public static void main(String[] args){
		int[][] building;
		int people=0, sum=0, average=0, average_Age=0;
    int [] aboveBelow;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of apartments in the building:");
		int numberApartments = in.nextInt();
		building = new int[numberApartments][];

		for(int i=0; i<building.length; i++){
		System.out.println("Enter the amount of people in " + (i+1) +  " apartment: ");
		people = in.nextInt();
		building[i] = new int[people+1];
		building[i][0]= people;

			for(int j=1; j<building[i].length; j++){
				System.out.println("The age of " + j + " is:" );
				building[i][j]= in.nextInt();

			}

		}

		sum = summation(building);
		System.out.println("The sum of the people are: " + sum);

		average = AVG(building);
		System.out.println("The average of the people are: " + average);

    aboveBelow = aboveAndBelow(building);
    System.out.println("The amount of people above the average are: " + aboveBelow[0]);
    System.out.println("The amount of people below the average are: " + aboveBelow[1]);

		average_Age= averageAge(building);
		System.out.println("The Average Age of the People: " + average_Age);
	}

	public static int summation(int[][] building){
		int sum=0;
		for(int i=0; i<building.length; i++){
			sum+=building[i][0];
  }
		return sum;

	}

	public static int AVG(int[][] building){
		return summation(building)/building.length;

	}

	public static int[] aboveAndBelow(int[][] building){
    int[] aboveBelow= new int[2];

		for(int i=0; i<building.length; i++){
			if(AVG(building)>building[i][0])
				(aboveBelow[0])++;
			else
				(aboveBelow[1])++;


	  }
    return aboveBelow;
  }

	public static int averageAge(int[][] building){
		int sum=0, count=0;
		for(int i=0; i<building.length; i++){
			for(int j=0; j<building[i].length; j++){
				sum=sum+building[i][j];
				count++;
			}
		}
		return sum/count;
	}

}
