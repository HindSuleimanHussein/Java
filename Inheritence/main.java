
public class main {
	
	public static void main(String[] args){
		
		Account[] account = new Account[4];
		account[0]= new Checking(1202416, 500);
		account[1]= new Saving(1209876, 200);
		account[2]= new Checking(1206754, 700);
		account[3]= new Saving(1202343, 50);
		
		
		account[0].withdraw(1550);
		account[0].deposit(400);
		account[1].withdraw(500);
		account[1].deposit(300);
		printAccount(account);
	}
	
	public static void printAccount(Account[] account){
		for (int i = 0; i < account.length; i++) {
			if(account[i] instanceof Checking){
				System.out.println( ((Checking)account[i]).toString() );
			}
			
			else if(account[i] instanceof Saving){
				System.out.println(((Saving)account[i]).toString());
			}
		}
		
	}

}
