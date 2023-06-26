import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("student.txt");
		File fileOut = new File("output.txt");
		PrintWriter writer = new PrintWriter(fileOut);

		Scanner input = new Scanner(file);
		String name;
		int grade1, grade2, grade3;
		double average = 0;

		while (input.hasNext()) {
			name = input.next();
			grade1 = input.nextInt();
			grade2 = input.nextInt();
			grade3 = input.nextInt();
			average = (grade1 + grade2 + grade3) / 3;
			writer.println(name + " " + average);
		}

		writer.close();
		input.close();

	}

}
