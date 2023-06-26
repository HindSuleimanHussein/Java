
public class Checking extends Account {

	final double overdraft=-1000;
	
	public Checking() {
		super();
	}

	public Checking(int id, double balance) {
		super(id, balance);
	}
	
	public void withdraw(double amount){
		 double net = super.getBalance()-amount;
		 if(net>=overdraft){
			 super.withdraw(amount);
		 }
		 
		 else
			 System.out.println("Can't Withdraw");
		}
		
		public void deposit(double amount){
		 super.deposit(amount);
		}

		@Override
		public String toString() {
			return "Checking overdraft=" + overdraft;
		}
	

}
