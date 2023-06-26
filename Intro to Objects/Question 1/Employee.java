import java.util.*;

public class Employee {
	private int departmentNo;
	private String name;
	private long id;
	private Date birthDate;
	private Date hireDate;
	private double basicSalary;
	
	public Employee(){
		
	}
	
	public Employee(int departmentNo, String name, long id, Date birthDate, Date hireDate, double basicSalary){
		this.departmentNo=departmentNo;
		this.name=name;
		this.id=id;
		this.birthDate=birthDate;
		this.hireDate=hireDate;
		this.basicSalary=basicSalary;
	}

	public int getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public void printEmployeeInfo(){
		System.out.println("Department: " + getDepartmentNo() + " Name: " + getName() + " ID: " + getId() + " Date of Birth: " + getBirthDate() + " Date Hired: " + getHireDate() + " Basic Salary: " + getBasicSalary());
	}
}
