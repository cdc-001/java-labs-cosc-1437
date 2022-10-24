//FA2022_BankService_Caddell.java

import java.util.Scanner;
import java.util.Random;

public class FA2022_BankService_Caddell 
{
	public static void main(String[] args)
	{
		
		int selection;
		String name;
		float balance;
		float interestRate;
		
		FA2022_BankAccount_Caddell account = null;
		Scanner keyboard = new Scanner(System.in);
		
		do
		{
			/* Display menu */		
			System.out.print("FA2022_BankService_Caddell.java\n"
					+ "ONLINE BANK - CORY CADDELL\n"
					+ "-------------------------------------------\n"
					+ "1. Open New Account\n"
					+ "2. Check Current Balance\n"
					+ "3. Check Interest Rate \n"
					+ "4. Deposit\n"
					+ "5. Withdrawal\n"
					+ "6. Bank Statement\n"
					+ "0. Exit\n\n"
					+ "Enter your selection: ");	
			
			/* Read user input from keyboard */
			selection = keyboard.nextInt();
			
			/* Execute task per user selection */		
			if (selection > 1 && selection <= 6 && account == null)	 //Validate account has been created before selecting tasks 2 - 6
			{
				System.out.println("\nSelect task 1 to create a new account before selecting this task.\n");
				continue;
			}
			else
			{
				switch (selection)
				{
					
					case 0:
						System.out.println("\nThank you for banking with ONLINE BANK.  Have a good day!");
						break;
					case 1:						//Open new checking account
						System.out.println("\nEnter the following information: ");
						keyboard.nextLine();
						
						System.out.print("  Name: ");
						name = keyboard.nextLine();
						
						System.out.print("  Balance: ");
						balance = keyboard.nextFloat();
						
						System.out.print("  Interest Rate: ");
						interestRate = keyboard.nextFloat();
						
						do 
						{
							if(balance < 20)	//Validate opening balance
							{
								System.out.print("\nTo open a new account, the money amount should be at least $20.00.\n"
										+ "Enter your balance or enter '0' to return to the main menu: ");
								balance = keyboard.nextInt();
							}
							else
							{							
								account = new FA2022_BankAccount_Caddell(name, balance, interestRate);
								System.out.println("\n" + account.openNewAccount());
								break;
							}
						}while (balance != 0);
						
						System.out.println();	//Add a space before returning to main menu.
						break;
						
					case 2:						//Check current balance
						System.out.println("\n" + account.checkCurrentBalance());		
						break;							
						
					case 3:						//Check interest rate
						System.out.println("\n" + account.checkInterestRate());	
						break;
						
					case 4:						//Deposit
						System.out.print("\nEnter your deposit amount: ");
						balance = keyboard.nextFloat();		
						System.out.println("\n" + account.displayDeposit(balance));
						break;
						
					case 5:						//Withdraw
						System.out.print("\nEnter your withdrawal amount: ");
						balance = keyboard.nextFloat();		
						System.out.println("\n" + account.displayWithdraw(balance));
						break;
						
					case 6:						//Display bank statement
						System.out.println("\n" + account.bankStatement());
						break;
						
					default:					//Validate selection
						System.out.print("\nInvalid selection. Returning to main menu.\n\n");
						break;
				}
			}
		}while (selection != 0);
		
		keyboard.close();
	}
}
