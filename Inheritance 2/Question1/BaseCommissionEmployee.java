
public class BaseCommissionEmployee extends ComissionEmployee{

	private double baseSalary;


	public BaseCommissionEmployee() {
		super();
	}

	public BaseCommissionEmployee(String firstName, String lastName, int id,
			double rate, double sales, double baseSalary) {
		super(firstName, lastName, id, rate, sales);
		this.baseSalary=baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double earning(){
		return super.earning()+ getBaseSalary();
	}

	public String toString(){
		return super.toString() + " with basic salary" + getBaseSalary();
	}


}
