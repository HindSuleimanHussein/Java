import java.util.Date;

public class Question2 {

	public static void main(String[] args){
		Employee[] employee = new Employee[4];
		
		employee[0] = new Employee(3, "Hind", 1202416, new Date(103, 5, 12), new Date(120, 4, 20), 3000.0);
		employee[1] = new Employee(2, "Mahmoud", 1198765, new Date(102, 2, 2), new Date(129, 4, 20), 10000.0);
		employee[2] = new Employee(1, "Lesley", 1205476, new Date(103, 11, 27), new Date(120, 8, 19), 2500.0);
		employee[3] = new Employee(3, "Suleiman", 1216754, new Date(103, 6, 14), new Date(121, 5, 20), 1500.0);
		
		System.out.println("Maximum Salary: ");
		Employee largest = largestSalary(employee);
		largest.printEmployeeInfo();
		
		System.out.println("==================================================================================================================");
		printInfo(employee);
	}
	
	public static Employee largestSalary(Employee[] employee){
		Employee large=employee[0];
		for (int i = 0; i < employee.length; i++) {
			if(employee[i].getBasicSalary()>large.getBasicSalary())
				large = employee[i];
			
		}
		
		return large;
	}
	
	public static void printInfo(Employee[] emp){
		for(int i=0; i<emp.length; i++){
			emp[i].printEmployeeInfo();
		}
	}
	
}
