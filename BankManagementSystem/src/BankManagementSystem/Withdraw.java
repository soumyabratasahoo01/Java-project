package BankManagementSystem;

import java.util.Scanner;

public class Withdraw {
 
public Withdraw(Scanner scanner, Account acc) {
	System.out.println("Enter mount: ");
	double amount = scanner.nextInt();
	acc.setBalance(acc.getBalance() - amount);
	System.out.println("Operter done successfully");
	
	}

}
