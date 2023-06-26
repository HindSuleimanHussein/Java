
public abstract class Employee implements Comparable<Employee>{
	protected String firstName;
	protected String lastName;
	protected int id;

	public Employee(){

	}


	public Employee(String firstName, String lastName, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public abstract double earning();
	public abstract String toString();


	@Override
	public int compareTo(Employee o) {
		return (int) (this.earning()-o.earning());
	}





}
