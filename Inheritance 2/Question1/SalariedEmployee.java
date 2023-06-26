
public class SalariedEmployee extends Employee{

	private double weeklySalary;



	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(String firstName, String lastName, int id, double weeklySalary) {
		super(firstName, lastName, id);
		this.weeklySalary=weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}



	@Override
	public double earning() {
		return weeklySalary*4.5;
	}

	@Override
	public String toString() {
		return " weeklySalary=" + weeklySalary + ", earning()=" + earning() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getId()=" + getId() + "]";
	}




}
