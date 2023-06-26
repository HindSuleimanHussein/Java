import java.util.*;

public class Question2{

	public static void main(String[] args){

		int hours=0;
		while (hours!=-1){
		System.out.println("Enter hours worked (-1 to end): ");
		Scanner in = new Scanner(System.in);
		hours = in.nextInt();
		
		if(hours ==-1){
		System.exit(0);
		}

		System.out.println("Enter hourly rate of the worker($00.00): ");
		double hourlyRate = in.nextDouble();

		double salary = FindSalary(hours, hourlyRate);
		System.out.println("The salary is: " + salary);

		}
	}

	public static double FindSalary(int hours, double hourlyRate){
	
		double salary=hours*hourlyRate;
		if (hours > 40){
		hours-=40; //remove hours before the bonus hours
		double bonus = (hours*hourlyRate)*0.5;
		return salary+bonus;
		}
	
		else {
		return salary;
		}
	
	}

}