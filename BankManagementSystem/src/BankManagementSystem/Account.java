package BankManagementSystem;

public class Account {

	private String firstName;
	private String lastName;
	private int accid;
	private double balance;
	private  int Passcode;
	
	public Account() {}

	public Account(String firstName, String lastName, int accid, double balance, int passcode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accid = accid;
		this.balance = balance;
		this.Passcode = passcode;
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

	public int getAccid() {
		return accid;
	}

	public void setAccid(int accid) {
		this.accid = accid;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getPasscode() {
		return Passcode;
	}

	public void setPasscode(int passcode) {
		Passcode = passcode;
	};
	
	

}
