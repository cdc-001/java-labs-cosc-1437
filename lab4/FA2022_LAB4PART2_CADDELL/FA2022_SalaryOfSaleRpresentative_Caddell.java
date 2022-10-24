//FA2022_SalaryOfSaleRepresentative_Caddell.java

import java.util.Scanner;
public class FA2022_SalaryOfSaleRpresentative_Caddell 
{
	public static void main(String[] args)
	{
		String name;
		String employeeID;
		float saleAmount;
		
		//Read input from keyboard
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		name = keyboard.nextLine();
		
		System.out.print("Enter your employee identification number: ");
		employeeID = keyboard.nextLine();
		
		System.out.print("Enter your amount of sales: ");
		saleAmount = keyboard.nextFloat();
		
		keyboard.close();
		
		//Calculate salary
		FA2022_SaleRepresentative_Caddell salary = new FA2022_SaleRepresentative_Caddell(name, employeeID, saleAmount);
				
		//Display output to screen
		System.out.println(salary.toString());		
	}
}
