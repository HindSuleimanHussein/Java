
public class Saving extends Account{

	public Saving() {
		super();
	}

	public Saving(int id, double balance) {
		super(id, balance);
	}

	
	public void withdraw(double amount){
		 double net = super.getBalance()-amount;
		 if(net>0){
			 super.withdraw(amount);
		 }
		 
		 else
			 System.out.println("Cannot withdraw because you're broke");
		}
		
		public void deposit(double amount){
		 super.deposit(amount);
		}

		@Override
		public String toString() {
			return "Saving " + super.toString();
		}
		
		
	
}
