class Account {
	private int accno;
	private String name;
	private float amount;
	public void getData(int accno, String s, float a) {
		this.accno = accno;
		name = s;
		amount = a;
	}
	public void deposit(float amt) {
		amount = amount + amt;
		System.out.println(amt + " deposited");
	}
	public void withdraw(float amt) {
		if(amt > amount) {
			System.out.println("Insufficient balance");
		}else{
			amount = amount - amt;
			System.out.println(amt + " withdrawn");
		}	
	}
	public void checkBalance() {
		System.out.println("Balance is : " + amount);
	}
	public void printData() {
		System.out.println(accno + " " + name + " " +  amount);
	}
}

public class AccountMain {
	public static void main(String... args) {
		Account a = new Account(); 
		a.getData(832345, "Ankit", 1000);
		a.printData();
		a.checkBalance();
		a.deposit(5000);
		a.checkBalance();
		a.withdraw(2500);
		a.checkBalance();
	}
}
