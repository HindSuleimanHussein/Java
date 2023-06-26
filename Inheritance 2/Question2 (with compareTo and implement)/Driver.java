import java.util.*;

public class Driver {

	public static void main(String args[]){
		ArrayList<Shape> shape = new ArrayList<>();
		shape.add(new Circle(1, "red", true));
		shape.add(new Circle(1, "blue", false));
		shape.add(new Rectangle(11, 12, "purple", true));
		shape.add(new Rectangle(6, 3, "green", false));
		shape.add(new Rectangle(9, 2, "orange", true));

		printList(shape);

		if(shape.get(0).equals(shape.get(1)))
			System.out.println("Equal");

		else
			System.out.println("Not Equal");



		if(shape.get(3).equals(shape.get(4)))
			System.out.println("Equal");

		else
			System.out.println("Not Equal");


		if(shape.get(2).equals(shape.get(4)))
			System.out.println("Equal");

		else
			System.out.println("Not Equal");

		Collections.sort(shape);
		printList(shape);


	}

	public static void printList(ArrayList<Shape> shape){
		for(int i=0; i<shape.size(); i++){
			if(shape.get(i) instanceof Circle){
				System.out.println(((Circle)shape.get(i)).toString());
			}
			else if(shape.get(i) instanceof Rectangle){
				System.out.println(((Rectangle)shape.get(i)).toString());
			}
		}
	}

	}
