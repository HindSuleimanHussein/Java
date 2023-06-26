
public class Question3 {

	public static void main(String[] args) {
		City[] city = new City[4];
		double average;
		int sum=0;
		city[0] = new City("Ramallah", 34.5, 40.9, 21);
		city[1] = new City("Birzeit", 36.7, 42.9, 19);
		city[2] = new City("Rawabi", 32.3, 50.9, 15);
		city[3] = new City("Nablus", 40.7, 60.2, 28);
		

		for(int i=0; i<city.length; i++){
		  sum+=city[i].getTemperature();
		}
		average=sum/city.length;
		System.out.println("The average is: " + average);
		
		System.out.println("The Cities below the average are: ");
		belowAverage(city,average);
	}
	

	public static void belowAverage(City[] city, double avgTemp){
		
		for (int i = 0; i < city.length; i++) {
			if(city[i].getTemperature()<avgTemp){
				city[i].printCityInfo();
			}
		}
	}

}
