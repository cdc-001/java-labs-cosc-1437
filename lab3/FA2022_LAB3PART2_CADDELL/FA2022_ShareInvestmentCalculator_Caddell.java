// FA2022_ShareInvestmentCalculator_Caddell.java

import java.util.Scanner;
public class FA2022_ShareInvestmentCalculator_Caddell 
{
	public static void main(String[] args)
	{
		// Declare variables
		String name;
		int numOfShares;
		float pricePerShare;
		float annualDiv;
		
		// Create scanner object and read user input
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the following information:");
		
		System.out.print("  Name: ");
		name = keyboard.nextLine();
		
		System.out.print("  Number of shares: ");
		numOfShares = keyboard.nextInt();
		
		System.out.print("  Price of each share: ");
		pricePerShare = keyboard.nextFloat();
		
		System.out.print("  Percentage of yearly dividend: ");
		annualDiv = keyboard.nextFloat();
		
		keyboard.close();
		
		// Create investor object to calculate and display ending balance
		FA2022_Investor_Caddell investor = new FA2022_Investor_Caddell(name, numOfShares, pricePerShare, annualDiv);
		
		// Display output to screen
		System.out.println(investor.toString());		
	}

}
