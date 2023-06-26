
public class HourlyEmployee extends Employee{

	private double wage;
	private double hoursWorked;



	public HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HourlyEmployee(String firstName, String lastName, int id, double wage, double hoursWorked) {
		super(firstName, lastName, id);
		this.wage=wage;
		this.hoursWorked=hoursWorked;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	@Override
	public double earning() {
		return hoursWorked*wage;
	}
	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hoursWorked=" + hoursWorked + ", earning()=" + earning()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getId()=" + getId()
				+ "]";
	}



}
