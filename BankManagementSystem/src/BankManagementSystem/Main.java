package BankManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner scanner;
	static int Lastaccid = 0 ;
    private static ArrayList<Account> accounts;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accounts = new ArrayList<>();
		scanner = new Scanner(System.in);
	    Database database = new Database(); 
	    accounts = database.getAccounts();
		//Lastaccid = accounts.get(accounts.lastIndexOf(accounts)).getAccid()+1;
	    Lastaccid = accounts.size();
	    
		System.out.println("welcome to sahoo Bank");
		System.out.println("1 - create new account");
		System.out.println("2 - Login");
		System.out.println(" 3 - Exit");
		int i = scanner.nextInt();
		switch(i) {
		case 1 : new CreateAccount(scanner, Lastaccid, accounts, database);break;
		case 2 : new Login(scanner, accounts, database);break;
		
		}
	}
}
    
