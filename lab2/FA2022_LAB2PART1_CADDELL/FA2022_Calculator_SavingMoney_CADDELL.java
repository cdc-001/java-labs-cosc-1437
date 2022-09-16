// File Name: FA2022_Calculator_SavingMoney_CADDELL.java

import java.util.Scanner;
public class FA2022_Calculator_SavingMoney_CADDELL 
{
	public static void main(String[] args)
	{
		// Declare Variables
		String custName;
		float begBalance;
		float endBalance;
		float intRate;
		Scanner keyboard = new Scanner(System.in);
		
		// Request and read user input
		System.out.println("Enter the following savings account information:");
		
		System.out.print("  Customer Name: ");
		custName = keyboard.nextLine();
		
		System.out.print("  Deposit: ");
		begBalance = keyboard.nextFloat();
		
		System.out.print("  Interest Rate: ");
		intRate = keyboard.nextFloat();
		
		keyboard.close();
		
		// Calculate interest earned and ending balance
		endBalance = begBalance + begBalance * intRate;
		
		// Format and Display output to screen
		System.out.println("--------------------------------------------------");
		System.out.println("File: FA2022_Calculator_SavingMoney_Caddell.java");
		System.out.println("Bank Application – 09/07/2022 - Cory Caddell");
		System.out.println("--------------------------------------------------");
		System.out.printf("Name of Bank Customer:             %15s\n", custName);
		System.out.printf("Amount of Saving Money:            %15.2f\n", begBalance);
		System.out.printf("Interest Rate:                     %15.2f%%\n", intRate * 100);
		System.out.println("--------------------------------------------------");
		System.out.printf("Total money at the end of year:    %15.2f\n", endBalance);
	}
}