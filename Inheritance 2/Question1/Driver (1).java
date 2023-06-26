import java.util.*;

public class Driver {

	public static void main(String[] args){
		ArrayList <Employee> employee = new ArrayList<>();
		employee.add(new SalariedEmployee("Ali", "Sami", 1202345, 1200));
		employee.add(new SalariedEmployee("Hind", "Hussein", 1202416, 1300));
		employee.add(new HourlyEmployee("Yara", "Lotfi", 1205432, 90, 40));
		employee.add(new HourlyEmployee("Rayan", "Amr", 1208976, 75, 38));
		employee.add(new ComissionEmployee("Shaymaa", "Hamadi", 1202345, 0.03, 1350));
		employee.add(new ComissionEmployee("Lucifer", "Khateer", 1203243, 0.02, 1400));

		employee.add(new BaseCommissionEmployee("Haneen", "Salam", 1202121, 0.02, 1400, 3000));
		employee.add(new BaseCommissionEmployee("Amal", "Suleiman", 1209483, 0.03, 1250, 6800));

		System.out.println("Content of List: ");
		printList(employee);

		System.out.print(" Total Earning: " + totalEarning(employee) + "\n");

		System.out.println("Content of List: ");
		sort( employee);
		printList(employee);


	}

	public static void printList(ArrayList<Employee> employee){
		for(int i=0; i<employee.size(); i++){
			System.out.println(employee.get(i).toString());
		}
	}

	public static double totalEarning(ArrayList<Employee> employee){
		double total=0;
		for(int i=0; i<employee.size(); i++){
			total+=employee.get(i).earning();
		}
		return total;
	}


    public static void sort(ArrayList<Employee> employee){
    	Employee temp;

    	for(int i=0; i<employee.size(); i++){
    		for(int j=0; j<employee.size(); j++){
    			if(employee.get(i).compareTo(employee.get(j))>0){
    				temp=employee.get(i);
    				employee.set(i, employee.get(j));
    				employee.set(j, temp);
    			}
    		}
    	}
    }

}
