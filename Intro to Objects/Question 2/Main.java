
public class Main {

	public static void main(String[] args) {
		  int[] array1 = {33,44,55,66,77,88,99,100};
		  int[] array2 = {3,4,5,6,7,8,9,10};
		  int[] array3 = {73,45,67,32,12,65,78};
		  int[] array4 = {45,78,34,98,76,54,32,21,12};
		  
		  MyArray[] myArr = new MyArray[4];
		  myArr[0]=new MyArray(array1);
		  myArr[1]=new MyArray(array2);
		  myArr[2]=new MyArray(array3);
		  myArr[3]=new MyArray(array4);
		  
		  array1[4]=-100;
		  
		  for(int i=0; i<myArr.length; i++){
			  myArr[i].printArray();
			  System.out.println();
			  System.out.println("Min in array " + (i+1) + " is: " + myArr[i].min());
			  System.out.println("Max in array " + (i+1) + " is: " + myArr[i].max());
			  System.out.format("Average in array %d is %2.2f", (i+1), myArr[i].average()); // just like printf but format will see eveything and printf will ignore the second comma
			  System.out.println("Size in array: " + (i+1) + " is: " + myArr[i].getSize());
			  
		  }

	}
}
