// File name: FA2022_ShareInvestmentCalculator_Caddell.java

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
		
		// Declare objects
		FA2022_Investor_Caddell investor;
		Scanner keyboard = new Scanner(System.in);
		
		// Request and read user input
		System.out.println("Enter the following information:");
		
		System.out.print("  Name: ");
		name = keyboard.nextLine();
		
		System.out.print("  Number of shares: ");
		numOfShares = keyboard.nextInt();
		
		System.out.print("  Price of each share: ");
		pricePerShare = keyboard.nextFloat();
		
		System.out.print("  Percentage of yearly dividend (in decimal format): ");
		annualDiv = keyboard.nextFloat();
		
		keyboard.close();
		
		// Create investor object
		investor = new FA2022_Investor_Caddell(name, numOfShares, pricePerShare, annualDiv);
		
		// Display output to screen
		System.out.println("\n" + investor);		
	}

}
