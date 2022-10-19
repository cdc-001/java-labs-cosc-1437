//FA2022_BankService_Caddell

import java.util.Scanner;
public class FA2022_BankService_Caddell 
{
	public static void main(String[] args)
	{
		
		int selection;
		String name;
		String address;
		String accountNumber  = "12323423423";				//Ned to randomize this!!!
		float balance = 0;
		float interestRate;
		float interest;
		float deposit;
		float withdraw;
		
		FA2022_BankAccount_Caddell account = null;
		Scanner keyboard = new Scanner(System.in);
		
		

		do
		{
			// Display menu and read task selection		
			System.out.print("FA2022_BankService_Caddell.java\n"
					+ "ONLINE BANK - CORY CADDELL\n"
					+ "-------------------------------------------\n"
					+ "1. Open New Account\n"
					+ "2. Check Current Balance\n"
					+ "3. Change Interest Rate \n"
					+ "4. Deposit\n"
					+ "5. Withdrawal\n"
					+ "6. Bank Statement\n"
					+ "0. Exit\n"
					+ "Enter your selection: ");						
			
			// Read input from keyboard
			selection = keyboard.nextInt();
			
			// Validate selection
			while (selection < 0 || selection > 6)
			{
				System.out.print("Invalid selection. Choose from the above menu: ");
				selection = keyboard.nextInt();
			}
			
			// Perform task
			switch (selection)
			{
			//Open new checking account
			case 1:		
				System.out.println("\nEnter the following information: ");
				keyboard.nextLine();
				
				System.out.print("  Name: ");
				name = keyboard.nextLine();
				
				System.out.print("  Address: ");
				address = keyboard.nextLine();
				
				System.out.print("  Balance: ");
				balance = keyboard.nextFloat();
				
				System.out.print("  Interest Rate: ");
				interestRate = keyboard.nextFloat();
				
				do 
				{
					//Validate opening balance
					if(balance < 20)
					{
						System.out.print("\nTo open a new account, the money amount should be at least $20.00.\n"
								+ "Enter your balance or enter '0' to return to the main menu: ");
						balance = keyboard.nextInt();
					}
					else
					{
						account = new FA2022_BankAccount_Caddell(name, accountNumber, balance, interestRate);
						System.out.println("\n" + account.openNewAccount());
						break;
					}
				}while (balance != 0);
				System.out.println();				                       //Add a space before returning to main menu.
				break;
			//Check current balance
			case 2:
				//Validate an account has been created
				if( account == null)
				{
					System.out.println("\nSelect task 1 to create a new account before selecting this task.\n");
					break;
				}
				else
				{
					System.out.println("\n" + account.checkCurrentBalance());
				}
			}
		}while (selection != 0);
		
		System.out.println("\nThank you for banking with ONLINE BANK.  Have a good day!");
	}
}
