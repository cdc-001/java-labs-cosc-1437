//FA2022_SaleProduct_Caddell.java

import java.util.Scanner;

public class FA2022_SaleProduct_Caddell 
{
	
	/** This program calculates and displays total sales of a product that comes in three sizes */
	public static void main(String[] args)
	{
		// Declare variables
		final int ARRAY_SIZE = 3;						      //Number of different sizes
		
		String productID;									  //Product ID number
		String productName;									  //Product name
		String[] productSize = {"Small", "Medium", "Large"};  //Size each product comes in
		int[] unitsOrdered = new int[ARRAY_SIZE];			  //Total units ordered per size
		float[] unitPrice = new float[ARRAY_SIZE];            //Unit price per size
		
		// Read input from user
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter product name: ");
		productName = keyboard.nextLine();
		
		System.out.print("Enter product ID: ");
		productID = keyboard.nextLine();
		
		for (int i = 0; i < ARRAY_SIZE; i++)
		{
			System.out.println("Enter the following order information for product size "+ productSize[i] + ":");
			System.out.print("  Number of units purchased: ");
			unitsOrdered[i] = keyboard.nextInt();
			System.out.print("  Price per unit: ");
			unitPrice[i] = keyboard.nextFloat();
		}
		System.out.println();
		keyboard.close();
		
		// Calculate total sales
		FA2022_Product_Caddell saleInfo = new FA2022_Product_Caddell(productID, productName, unitsOrdered, unitPrice);
		

		// Display sales report to screen
		System.out.println(saleInfo.toString());	
	}
}
