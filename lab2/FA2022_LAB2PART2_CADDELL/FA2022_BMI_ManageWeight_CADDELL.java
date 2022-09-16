// File Name: FA2022_BMI_ManageWeight_CADDELL.java

import java.util.Scanner;
public class FA2022_BMI_ManageWeight_CADDELL 
{
	public static void main(String[] args)
	{
		// Declare variables
		String userName;
		String standardBMI = "18.5 - 24.9";
		float userHeight;
		float targetBMI;
		float targetWeight;
		Scanner keyboard = new Scanner(System.in);		
		
		// Request and read user input
		System.out.println("Enter the following information:");
		
		System.out.print("  Name: ");
		userName = keyboard.nextLine();
		
		System.out.print("  Height (in inches): ");
		userHeight = keyboard.nextInt();
		
		System.out.print("  Targeted BMI: ");
		targetBMI = keyboard.nextInt();
		
		keyboard.close();
		
		// Calculate target weight
		targetWeight = (targetBMI * userHeight * userHeight) / 703 ;
		
		// Format and display output to screen
		System.out.println("--------------------------------------------------");
		System.out.println("File: FA2022_BMI_ManageWeight_Caddell.java");
		System.out.println("Fall 2022 Semester – 09/07/2022 - Cory Caddell");
		System.out.printf("Standard BMI:                   %15s\n", standardBMI);
		System.out.println("--------------------------------------------------");
		System.out.printf("Name:                           %15s\n", userName);
		System.out.printf("Height:                         %15.2f\n", userHeight);
		System.out.printf("To have BMI:                    %15.2f\n", targetBMI);
		System.out.println("--------------------------------------------------");
		System.out.printf("Your weight(pounds) should be:  %15.2f\n", targetWeight);
			
	}

}