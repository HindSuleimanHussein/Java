import java.util.*;

public class Account {
	
	private int id;
	private double balance;
	private Date dateCreated;
	
	
	public Account() {
		this.dateCreated=new Date();
	}


	public Account(int id, double balance) {
		this();
		this.id = id;
		this.balance = balance;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Date getDateCreated() {
		return dateCreated;
	}


	public void withdraw(double amount){
	 this.balance-=amount;
	}
	
	public void deposit(double amount){
	 this.balance+=amount;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", dateCreated=" + dateCreated + "]";
	}
	
	
	
	
	
	

	
}
