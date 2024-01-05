package BankManagementSystem;

import java.util.Scanner;

public class Deposit {
	
	public Deposit(Scanner scanner, Account acc) {
		System.out.println("Enter mount: ");
		double amount = scanner.nextInt();
		acc.setBalance(acc.getBalance() + amount);
		System.out.println("Operter done successfully");
		
	}

}
