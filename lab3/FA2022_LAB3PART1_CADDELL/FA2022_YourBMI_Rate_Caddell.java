//FA2022_YourBMI_Rate_Caddell.java


import java.util.Scanner;
public class FA2022_YourBMI_Rate_Caddell 
{
	public static void main(String[] args)
	{
		// Declare Variables
		String name;
		int height;
		float weight;
		
		// Create Scanner object to read input from keyboard
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the following information:");
		
		System.out.print("  Name: ");
		name = keyboard.nextLine();
		
		System.out.print("  Height (in inches): ");
		height = keyboard.nextInt();
		
		System.out.print("  Weight (in pounds): ");
		weight = keyboard.nextInt();
		
		keyboard.close();
		
		// Create object to calculate and display BMI
		FA2022_Adult_Caddell bmi = new FA2022_Adult_Caddell(name, height, weight);	
		
		// Display output to screen
		System.out.println(bmi.toString());
	}

}
