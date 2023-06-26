public class MyArray {
    private int[] array; //always make data member private, unless told otherwise

 
    MyArray(int[] arr1){
    	array=new int[arr1.length];
    	System.arraycopy(arr1, 0, array, 0, arr1.length);
    

    }

    public int[] getArray() {
		return array;
	}



	public void setArray(int[] array) {
		this.array = array;
	}



	public int min () {
        int min = getArray()[0];
        for (int i = 0; i < getArray().length; i++) {
            if (getArray()[i] < min) {
                min = getArray()[i];
            }
        }
        return min;
    }

    public int max(){
        int max=getArray()[0];
        for(int i=0; i<getArray().length; i++){
            if(getArray()[i]>max){
                max=getArray()[i];
            }
        }
        return max;
    }

    public double average(){
        int sum=0;
        for(int i=0; i<getArray().length; i++){
            sum+=getArray()[i];
        }
        return (double) sum/getSize();
    }

    public void printArray(){
        for(int i=0; i<getArray().length; i++){
            System.out.print(getArray()[i] + " ");
        }
    }

    public int getSize(){
        System.out.println();
        return getArray().length;
    }

}
