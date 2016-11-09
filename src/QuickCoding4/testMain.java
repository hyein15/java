package QuickCoding4;

public class testMain {
	
	public static BankAccount account = new BankAccount();
	public static void main (String []args) {
	Thread depositMan = new Thread() {
		public void run(){
			for(int i=0; i<10; i++)
			{
				account.add(10);	
			}
		}
	};
	
	Thread withdrawMan = new Thread() {
		
		public void run(){
			for(int i=0; i<10; i++)
			{
				account.delete(10);	
			}
		}
	};
	
	depositMan.start();
	withdrawMan.start();
	}

}
