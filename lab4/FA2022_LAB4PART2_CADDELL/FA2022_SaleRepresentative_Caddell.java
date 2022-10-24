//FA2022_SaleRepresentative_Caddell.java

import java.text.SimpleDateFormat;
import java.util.Date;

public class FA2022_SaleRepresentative_Caddell 
{
	// Define data members
	private String name;
	private String employeeID;
	private float saleAmount;
	
	// No-argument constructor method
	public FA2022_SaleRepresentative_Caddell()
	{
		name = "";
		employeeID = "";
		saleAmount = 0.0f;
	}
	
	// Parameterized constructor method accepting name, employee ID and sale amount as arguments
	public FA2022_SaleRepresentative_Caddell(String n, String id, float s)
	{
		name = n;
		employeeID = id;
		saleAmount = s;
	}
	
	// Mutator methods beginning with "set"
	public void setName(String n)
	{
		name = n;
	}
	public void setEmployeeID(String id)
	{
		employeeID = id;
	}
	public void setSaleAmount(float s)
	{
		saleAmount = s;
	}
	
	// Accessor methods beginning with "get"
	public String getName()
	{
		return name;
	}
	public String getEmployeeID()
	{
		return employeeID;
	}
	public float getSaleAmount()
	{
		return saleAmount;
	}
	
	// Method to calculate commission
	public double calcCommission()
	{
		if (saleAmount > 0)
		{
			return saleAmount * .0329;
		}
		else
		{
			return (0);
		}
	}
	
	// Method to calculate bonus
	public double calcBonus()
	{
		if (saleAmount >= 15000)
		{
			return (saleAmount - 10000) * .0259;
		}
		else if (saleAmount > 10000)
		{
			return (saleAmount - 10000) * .0219;
		}
		else
		{
			return (0);
		}
		
	}
	
	// Method to calculate total salary
	public double calcSalary()
	{
		return 2200 + calcCommission() + calcBonus();
	}
	
	// Method to display output with toString
	public String toString()
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		
		return "----------------------------------------------------------\n"
				+ "File FA2022_SalaryOfRepresentative_Caddell.java\n"
				+ String.format("%-28s%17s\n", "SALE COMPANY", "CORY CADDELL")
				+ String.format("%-28s%17s\n", "Today:", dateFormat.format(date))
				+ "----------------------------------------------------------\n"
				+ String.format("%-28s%17s\n", "Name of Sale Representative:", name)
				+ String.format("%-28s%17s\n", "Employee Id:", employeeID)
				+ String.format("%-28s%17.2f\n", "Sale amount:", saleAmount)
				+ "----------------------------------------------------------\n"
				+ String.format("%-28s%17s\n", "Base salary:", "2200.00")
				+ String.format("%-28s%17.2f\n", "Commission Amount:", calcCommission())
				+ String.format("%-28s%17.2f\n", "Bonus amount:", calcBonus())
				+ String.format("%-28s%17.2f\n", "Salary:", calcSalary())
				+ "----------------------------------------------------------";
	}

}
