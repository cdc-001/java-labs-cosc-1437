//FA2022_BankAccount_Caddell.java

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class FA2022_BankAccount_Caddell 
{
	private String name;
	private String accountNumber;				
	private float interestRate;                    
	private float balance;						
	
	/** No-argument constructor method. */
	public FA2022_BankAccount_Caddell()
	{
		name = "";
		accountNumber = "";
		interestRate = 0.0f;
		balance = 0.0f;
	}
	
	/** Parameterized constructor method accepting name, balance and interest rate as arguments. */
	public FA2022_BankAccount_Caddell(String n, float b, float i)
	{
		name = n;
		balance = b;
		interestRate = i;
		
		Random rand = new Random();
		int randValue1 = rand.nextInt(100000) + 10000000;
		int randValue2 = rand.nextInt(100000) + 10000000;
		accountNumber = String.valueOf(randValue1) + String.valueOf(randValue2);

	}
	
	/** Mutator method to set interest rate. */
	public void setName(String n)
	{
		name = n;
	}
	public void setAccountNumber(String a)
	{
		accountNumber = a;
	}
	public void setInterestRate(float i)
	{
		interestRate = i;
	}
	public void setBalance(float b)
	{
		balance = b;
	}
	
	/** Accessor methods starting with get. */
	public String getName()
	{
		return name;
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public float getInterestRate()
	{
		return interestRate;
	}
	public float getBalance()
	{
		return balance;
	}
	
	/** Method to display new account information. */
	public String openNewAccount()
	{
		return "FA2022_BankService_Caddell.java\n"
			 + "ONLINE BANK – Cory Caddell\n"
		   	 + "-------------------------------------------\n"
		   	 + "NEW ACCOUNT\n"
		   	 + String.format("%-20s%20s\n", "Account Number: ", accountNumber)
		   	 + String.format("%-20s%20s\n", "Account Name: ", name)
		   	 + String.format("%-20s%20.2f\n", "Balance: ", balance)
		   	 + String.format("%-20s%20.2f%%\n", "Interest Rate: ", interestRate)
		   	 + "-------------------------------------------";
	}
	
	/** Method to display current balance. */
	public String checkCurrentBalance()
	{
		return "FA2022_BankService_Caddell.java\n"
			 + "ONLINE BANK – CORY CADDELL\n"
		   	 + "-------------------------------------------\n"
		   	 + "CURRENT ACCOUNT\n"
		   	 + String.format("%-20s%20s\n", "Account Number: ", accountNumber)
		   	 + String.format("%-20s%20s\n", "Account Name: ", name)
		   	 + String.format("%-20s%20.2f\n", "Balance: ", balance)
		   	 + "-------------------------------------------\n"; 
	}
	
	/** Method to display current interest rate. */
	public String checkInterestRate()
	{
		return "FA2022_BankService_Caddell.java\n"
			 + "ONLINE BANK – CORY CADDELL\n"
		   	 + "-------------------------------------------\n"
		   	 + "INTEREST RATE\n"
		   	 + String.format("%-20s%20s\n", "Account Number: ", accountNumber)
		   	 + String.format("%-20s%20s\n", "Account Name: ", name)
		   	 + String.format("%-20s%20.2f\n", "Balance: ", balance)
		   	 + String.format("%-20s%20.2f%%\n", "Interest Rate: ", interestRate)
		   	 + "-------------------------------------------\n";
	}
	
	/** Method to display deposit information to screen. */
	public String displayDeposit(float d)
	{
		balance += d;
		
		return "FA2022_BankService_Caddell.java\n"
			 + "ONLINE BANK – Cory Caddell\n"
		   	 + "-------------------------------------------\n"
		   	 + "DEPOSIT\n"
		   	 + String.format("%-20s%20s\n", "Account Number: ", accountNumber)
		   	 + String.format("%-20s%20s\n", "Account Name: ", name)
		   	 + String.format("%-20s%20.2f\n", "Balance: ", balance - d)
		   	 + String.format("%-20s%20.2f\n", "Deposit: ", d)	   	 
		   	 + String.format("%-20s%20.2f\n", "New Balance: ", balance)
		   	 + "-------------------------------------------\n";
	}
	
	/** Method to display withdrawal information to screen. */
	public String displayWithdraw(float w)
	{
		balance -= w;
		
		if (balance - w > 20)
		{	
			return "FA2022_BankService_Caddell.java\n"
				 + "ONLINE BANK – Cory Caddell\n"
			   	 + "-------------------------------------------\n"
			   	 + "WITHDRAW\n"
			   	 + String.format("%-20s%20s\n", "Account Number: ", accountNumber)
			   	 + String.format("%-20s%20s\n", "Account Name: ", name)
			   	 + String.format("%-20s%20.2f\n", "Balance: ", balance + w)
			   	 + String.format("%-20s%27.2f\n", "Withdrawal: ", w)
			   	 + String.format("%-20s%20.2f\n", "New Balance: ", balance)
			   	 + "-------------------------------------------\n";	
		}
		else
		{
			balance += w;
			
			return "FA2022_BankService_Caddell.java\n"
				 + "ONLINE BANK – Cory Caddell\n"
			   	 + "-------------------------------------------\n"
			   	 + "WITHDRAW\n"
			   	 + String.format("%-20s%20s\n", "Account Number: ", accountNumber)
			   	 + String.format("%-20s%20s\n", "Account Name: ", name)
			   	 + String.format("%-20s%20.2f\n", "Balance: ", balance)
			   	 + String.format("%-20s%27.2f%-10s\n", "Withdrawal: ", w, " -denied")
			   	 + String.format("%-20s%20.2f\n", "New Balance: ", balance)
			   	 + "-------------------------------------------\n";
		}
	}
		
	/** Method to calculate interest and display information to screen. */
	public String bankStatement()
	{
		float interest = balance * interestRate / 100;
		balance += interest;
		
		SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		
		return "FA2022_BankService_Caddell.java\n"
			 + "ONLINE BANK – Cory Caddell\n"
		   	 + "-------------------------------------------\n"
		   	 + "BANK STATEMENT\n"
		   	 + String.format("%-20s%20s\n", "Statement Date: ", dateFormatter.format(date))
		   	 + String.format("%-20s%20s\n", "Account Number: ", accountNumber)
		   	 + String.format("%-20s%20s\n", "Account Name: ", name)
		   	 + String.format("%-20s%20.2f\n", "Balance: ", balance - interest)
		   	 + String.format("%-20s%20.2f%%\n", "Interest Rate: ", interestRate)
		   	 + String.format("%-20s%20.2f\n", "Interest Amount: ", interest)
		   	 + String.format("%-20s%20.2f\n", "New Balance: ", balance)
		   	 + "-------------------------------------------\n";
	}	

}
