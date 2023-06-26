
public class Question1 {
	
	public static void main(String[] args){
	Student[] array = new Student[5];
	array[0] = new Student(120, "Ali Jumah");
	array[1] = new Student(120, "Hind Hussein");
	array[2] = new Student(120, "Amr Barghothy");
	array[3] = new Student(119, "Mahmoud Hussein");
	array[4] = new Student(120, "Saja Khalili");
	
	printInfo(array);
	}
	
	public static void printInfo(Student[] array){
		for(int i=0; i<array.length; i++){
			System.out.println(array[i].getStudentId() + " " + array[i].getStudentName());
		}
	}
}
