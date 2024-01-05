package BankManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateAccount {
	public CreateAccount(Scanner scanner, int lastaccid, ArrayList<Account>accounts, Database database){
	  
	  System.out.println("Enter first name :  ");
	  String firstName = scanner.next();
	  System.out.println("Enter last name :  ");
	  String lastName = scanner.next();
	  System.out.println("Enter balance :  ");
	  double balance = scanner.nextDouble();
	  System.out.println("Enter passcode : (digits only)  ");
	  int passcode = scanner.nextInt();
	  System.out.println("Confirm passcode : (digits only)  ");
	  int passcodec = scanner.nextInt();
	  if(passcode != passcodec) {
		  System.out.println("not matching");
		  return;
	  }
	  int id = 10000000 + lastaccid;
	  lastaccid = lastaccid + 1;
	  Account acc = new Account(firstName, lastName, id, balance, passcode);
	  accounts.add(acc);
	  System.out.println("Your account Id:  "+id);
	  new Menu(scanner, acc, database, accounts);
	  
}

}
