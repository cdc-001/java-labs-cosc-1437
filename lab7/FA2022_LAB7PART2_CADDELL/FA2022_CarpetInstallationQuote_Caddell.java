//FA2022_CarpetInstallantionQuote_Caddell.java

import java.util.ArrayList;
import java.util.Scanner;

public class FA2022_CarpetInstallationQuote_Caddell 
{
	public static void main(String[] args)
	{
		final int sentinel = 0;										//Provide user choice to exit menu
		int selection;												//Menu selection
		int numOfRooms;												//Number of rooms for quote.  Also, used to initialize areaPerRoom array.
		int count;													//Iteration counter used to index areaPerRoomArray.
		
		String[][] shapes = {{"Square", "Length", "Width"}, 		//Shapes and respective dimension names
			                 {"Rectangle", "Length", "Width"},
							 {"Triangle", "Base", "Height"}, 
			                 {"Circle", "Radius"}, 
						     {"Trapezoid", "Base 1", "Base 2", "Height"}, 
			                 {"Parallelogram", "Base", "Height"}};
		
		double[] dimensions = new double[3];						//Max amount of dimensions
		double[] areaPerRoom;										//Store area value per room
		ArrayList<String> quote = new ArrayList<>();				//Store quote information strings
		
				
		Scanner keyboard = new Scanner(System.in);					
		
		//Read input from keyboard
		System.out.print("How many rooms for carpet installation quote? ");
		numOfRooms = isPositiveInteger(keyboard);
		areaPerRoom = new double[numOfRooms];
		
		count = 0;
		do
		{
			//Display menu
			System.out.println("\nFA2022_CarpetInstallationQuote_Smith.java\n"
					         + "ART CARPET INSTALLATION – JAMES SMITH\n"
					         + "-----------------------------------------------------");
			for(int i = 0; i < shapes.length; i++)
			{
				System.out.println((i + 1) + ". " + shapes[i][0]);
			}
			System.out.println("0. Done");
			
			//Read input from keyboard
			System.out.print("\nChoose the type of room for installation quote from the above menu or enter '0' to proceed: ");
			selection = isPositiveInteger(keyboard);
			
			//Read input from keyboard
			//Calculate area per room
			switch (selection)
			{
				case 0:				//Exit
					break;
				case 1:				//Square
					readQuoteParameters(keyboard, selection, shapes, dimensions, quote);
					areaPerRoom[count] = FA2022_StaticMethod_Caddell.calcSquareArea(dimensions[0], dimensions[1]);	
					break;
				case 2:				//Rectangle
					readQuoteParameters(keyboard, selection, shapes, dimensions, quote);
					areaPerRoom[count] = FA2022_StaticMethod_Caddell.calcRectangleArea(dimensions[0], dimensions[1]);	
					break;
				case 3:				//Triangle
					readQuoteParameters(keyboard, selection, shapes, dimensions, quote);
					areaPerRoom[count] = FA2022_StaticMethod_Caddell.calcTriangleArea(dimensions[0], dimensions[1]);
					break;
				case 4:				//Circle
					readQuoteParameters(keyboard, selection, shapes, dimensions, quote);			
					areaPerRoom[count] = FA2022_StaticMethod_Caddell.calcCircleArea(dimensions[0]);	
					break;
				case 5:				//Trapezoid
					readQuoteParameters(keyboard, selection, shapes, dimensions, quote);
					areaPerRoom[count] = FA2022_StaticMethod_Caddell.calcTrapezoidArea(dimensions[0], dimensions[1], dimensions[2]);
					break;
				case 6:				//Parallelogram
					readQuoteParameters(keyboard, selection, shapes, dimensions, quote);
					areaPerRoom[count] = FA2022_StaticMethod_Caddell.calcParallelogramArea(dimensions[0], dimensions[1]);
					break;
				default:
					System.out.println("Invalid entry.");
					count--;
					break;
			}
			
			count++;
			
		}while(selection != sentinel && count != numOfRooms);
		
		keyboard.close();
		
		//Calculate total area
		//Calculate cost
		//Display quote information to screen
		System.out.println("\nFA2022_CarpetInstallationQuote_Caddell.java\n"
					     + "ART CARPET INSTALLATION – CORY CADDELL\n"
					     + "PROJECT AT: 123 Walnut Road Dallas TX 75243\n"
					     + "----------------------------------------------------------------------");
		for (int i = 0; i < numOfRooms; i++)
		{
			if (areaPerRoom[i] != 0)                   //User chose sentinel value before entering information for all rooms if false
			{
				System.out.printf("%-60s%,10.2f\n", quote.get(i), areaPerRoom[i]);
			}	
		}
		System.out.printf("%-60s%,10.2f\n", "Sum of Area (square feet)", calcTotalArea(areaPerRoom));
		System.out.printf("----------------------------------------------------------------------\n");
		System.out.printf("%-60s%,10.2f\n", "Carpet Cost ($2.75 per square feet)", calcCarpetCost(areaPerRoom));
		System.out.printf("%-60s%,10.2f\n", "Labor ($1.25 per square feet)", calcLaborCost(areaPerRoom));
		System.out.printf("%-60s%,10.2f\n", "Materials", calcMaterialCost(areaPerRoom));
		System.out.printf("%-60s%,10.2f\n", "Subtotal", calcSubTotal(areaPerRoom));
		System.out.printf("%-60s%,10.2f\n", "Tax (8.25%)", calcSalesTax(areaPerRoom));
		System.out.printf("%-60s%,10.2f\n", "  Total Charge", calcTotalCost(areaPerRoom));		
	}
	
	/** Method to read and convert quote information into single string for displaying to screen */
	public static void readQuoteParameters(Scanner keyboard, int selection, String[][] shapes, double[] dimensions, ArrayList<String> quote)
	{
		
		System.out.println("\nEnter the following measurements in feet for the " + shapes[selection - 1][0] + " room:");

		
		if (selection == 4)      //Circle
		{
			System.out.print("  " + shapes[selection - 1][1] + ": ");
			dimensions[0] = isPositiveDouble(keyboard);
			
			quote.add(shapes[selection - 1][0] + " - " 
			        + shapes[selection - 1][1] + " = " + String.format("%.2f", dimensions[0]));
		}
		else if (selection == 5) //Trapezoid
		{			
			
			for (int i = 0; i < 3; i++)
			{
				System.out.print("  " + shapes[selection - 1][i + 1] + ": ");
				dimensions[i] = isPositiveDouble(keyboard);
			}
						
			quote.add(shapes[selection - 1][0] + " - " 
				    + shapes[selection - 1][1] + " = " + String.format("%.2f", dimensions[0]) + " " 
					+ shapes[selection - 1][2] + " = " + String.format("%.2f", dimensions[1]) + " " 
				    + shapes[selection - 1][3] + " = " + String.format("%.2f", dimensions[2]));
		}
		else					 //All other shapes
		{		
			for (int i = 0; i < 2; i++)
			{
				System.out.print("  " + shapes[selection - 1][i + 1] + ": ");
				dimensions[i] = isPositiveDouble(keyboard);
			}
						
			quote.add(shapes[selection - 1][0] + " - " 
				    + shapes[selection - 1][1] + " = " + String.format("%.2f", dimensions[0]) + " " 
				    + shapes[selection - 1][2] + " = " + String.format("%.2f", dimensions[1]));
		}
	}

	/** Method to calculate total area */
	public static double calcTotalArea(double[] apr)
	{
		double totalArea = 0;							//Sum of area for all rooms
		
		for (double area : apr)
		{
			if(area != 0)								//User chose sentinel value before entering information for all rooms if false
			{
				totalArea += area;
			}
		}
		
		return totalArea;
	}

	/** Method to calculate carpet cost */
	public static double calcCarpetCost(double[] apr)
	{
		return calcTotalArea(apr) * 2.75;
	}

	/** Method to calculate material cost */
	public static double calcMaterialCost(double[] apr)
	{
		return calcCarpetCost(apr) * .10;
	}

	/** Method to calculate labor cost */
	public static double calcLaborCost(double[] apr)
	{
		return calcTotalArea(apr) * 1.25;
	}

	/** Method to calculate sub-total */
	public static double calcSubTotal(double[] apr)
	{
		return calcCarpetCost(apr) + calcMaterialCost(apr) + calcLaborCost(apr);
	}

	/** Method to calculate sales tax */
	public static double calcSalesTax(double[] apr)
	{
		return calcSubTotal(apr) * .0825;
	}
	
	/** Method to calculate total cost */
	public static double calcTotalCost(double[] apr)
	{
		return calcSubTotal(apr) + calcSalesTax(apr);
	}

	/** Method to validate if positive integer is entered by user */
	public static int isPositiveInteger(Scanner keyboard)
	{
		int num = 0;
		
		do
		{
			while(!keyboard.hasNextInt())
			{
				System.out.print("Invalid entry. Please, try again: ");
				keyboard.nextLine();
			}
			
			num = keyboard.nextInt();
			if (num < 0)
			{
				System.out.print("Invalid entry. Please, try again: ");
				keyboard.nextLine();
			}
		}while(num < 0);
		
		
		return num;
	}

	/** Method to validate whether an positive double was entered by user from keyboard. */
	public static double isPositiveDouble(Scanner keyboard)
	{
		double num = 0.0;
		
		do
		{
			while(!keyboard.hasNextDouble())
			{
				System.out.print("Invalid entry. Please, try again: ");
				keyboard.nextLine();
			}
			
			num = keyboard.nextDouble();
			if (num < 0)
			{
				System.out.print("Invalid entry. Please, try again: ");
				keyboard.nextLine();
			}
		}while(num < 0);
		
		
		return num;
	}
}
