
public class ComissionEmployee extends Employee{

	private double rate;
	private double sales;

	public ComissionEmployee() {
		super();

	}
	public ComissionEmployee(String firstName, String lastName, int id, double rate, double sales) {
		super(firstName, lastName, id);
		this.rate=rate;
		this.sales=sales;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getSales() {
		return sales;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}
	@Override
	public double earning() {
		return rate*sales;
	}
	@Override
	public String toString() {
		return "ComissionEmployee [rate=" + rate + ", sales=" + sales + ", earning()=" + earning() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getId()=" + getId() + "]";
	}


}
