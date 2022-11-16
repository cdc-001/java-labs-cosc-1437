//FA2022_EmployeeSalaryOneWeek_Caddell.java

import java.util.Scanner;

public class FA2022_EmployeeSalaryOneWeek_Caddell 
{
	public static void main(String[] args)
	{
		String[] personalInfo = { "SS Number", "Last Name", "First Name", "Phone Number", "Address"};
		float salaryRate;
		
		FA2022_Person person  = null;
		Scanner keyboard = new Scanner(System.in);
		
		//Read salary information from keyboard
		System.out.println("Enter the following information: ");
		
		for (int i = 0; i < personalInfo.length; i++)
		{
			System.out.print("  " + personalInfo[i] + ": ");
			personalInfo[i] = keyboard.nextLine();
		}
		
		System.out.print("  Salary Rate: ");
		while(!keyboard.hasNextFloat()) 
		{
			System.out.println("Invalid entry.  Please, try again: ");
			salaryRate = keyboard.nextFloat();
		}
		salaryRate = keyboard.nextFloat();
		
		//Calculate Annual Salary
		person = new FA2022_Employee_Caddell(personalInfo[0], personalInfo[1], personalInfo[2], personalInfo[3], personalInfo[4], salaryRate);
		
		//Display salary information to screen
		System.out.print("\nFA2022_EmployeeSalaryOneWeek_Caddell.java\n"
				+ "SALARY OF THE WEEK – CORY CADDELL\n"
				+ "-----------------------------------------------\n"
				+ person);
	}
}
