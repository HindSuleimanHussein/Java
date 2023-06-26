import java.util.*;

class FirstLabQuestion{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("What is your ID?");
		int ID = input.nextInt();
		System.out.println("What is your Course Name and code?");
		String courseFirstName = input.nextLine();
		String courseLastName = input.nextLine();
		String code = input.nextLine();
		System.out.println("What is your professor's first and last name");
		String firstName = input.nextLine();
		String lastName = input.nextLine();
		System.out.println("Name: " + name + ", ID: " + ID + ", Course and Code: " + courseFirstName + " " + courseLastName + " " + code + " " + ", Professor's name: " + firstName + " " + lastName);

	}


}