
public class City {
	private String cityName;
	private double longitude;
	private double latitude;
	private int temperature;
	
	public City(){
		
	}

	public City(String cityName, double longitude, double latitude, int temperature) {
		super();
		this.cityName = cityName;
		this.longitude = longitude;
		this.latitude = latitude;
		this.temperature = temperature;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	public void printCityInfo(){
		System.out.println("The Name of the City: " + getCityName() + " The Longitude: " + getLongitude() + " The Latitude: " + getLatitude() + " The Temerature: " + getTemperature());
	}
	

}
