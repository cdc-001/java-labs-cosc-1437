//FA2022_BankAccount_Caddell.java

public class FA2022_BankAccount_Caddell 
{
	private String name;
	private String accountNumber;				// need to randomize this
	private float interestRate;                    
	private float openingBalance;
	private float deposit;
	private float withdraw;
	
	/** No-argument constructor method. */
	public FA2022_BankAccount_Caddell()
	{
		name = "";
		accountNumber = "";
		interestRate = 0.0f;
		openingBalance = 0.0f;
	}
	
	/** Parameterized constructor method accepting name, account number, and interest rate as arguments. */
	public FA2022_BankAccount_Caddell(String n, String a, float i, float b)
	{
		name = n;
		accountNumber = a;
		interestRate = i;
		openingBalance = b;
	}
	
	/** Mutator method to change interest rate. */
	public void changeInterestRate(float i)
	{
		interestRate = i;
	}
	
	
	/** Method to calculate current balance. */
	public float currentBalance()
	{
		return openingBalance += deposit + withdraw;
	}
	
	/** Method to display new account information. */
	public String openNewAccount()
	{
		return "FA2022_BankService_Smith.java\n"
			 + "ONLINE BANK – JAMES SMITH\n"
		   	 + "-------------------------------------------"
		   	 + "NEW ACCOUNT"
		   	 + String.format("%-20s%20s\n", "Account Number: ", accountNumber)
		   	 + String.format("%-20s%20s\n", "Account Name: ", name)
		   	 + String.format("%-20s%20s\n", "Balance: ", openingBalance)
		   	 + String.format("%-20s%20s\n", "Interest Rate: ", interestRate)
		   	 + "-------------------------------------------\n";

	}
	
	/** Method to display current balance. */
	public String checkCurrentBalance()
	{
		return "FA2022_BankService_Smith.java\n"
				 + "ONLINE BANK – JAMES SMITH\n"
			   	 + "-------------------------------------------"
			   	 + "CURRENT ACCOUNT"
			   	 + String.format("%-20s%20s\n", "Account Number: ", accountNumber)
			   	 + String.format("%-20s%20s\n", "Account Name: ", name)
			   	 + String.format("%-20s%20s\n", "Balance: ", currentBalance())
			   	 + "-------------------------------------------\n"; 
	}
	
	/** Method to display current interest rate. */
	public String checkInterestRate()
	{
		return "FA2022_BankService_Smith.java\n"
				 + "ONLINE BANK – JAMES SMITH\n"
			   	 + "-------------------------------------------"
			   	 + "INTEREST RATET"
			   	 + String.format("%-20s%20s\n", "Account Number: ", accountNumber)
			   	 + String.format("%-20s%20s\n", "Account Name: ", name)
			   	 + String.format("%-20s%20s\n", "Balance: ", currentBalance())
			   	 + String.format("%-20s%20s\n", "Interest Rate: ", interestRate)
			   	 + "-------------------------------------------\n";
	}
	
	/** Method to display deposit information to screen. */
	public String displayDeposit(float d)
	{
		deposit = d;
		
		return "FA2022_BankService_Caddell.java\n"
			 + "ONLINE BANK – Cory Caddell\n"
		   	 + "-------------------------------------------"
		   	 + "DEPOSIT"
		   	 + String.format("%-20s%20s\n", "Account Number: ", accountNumber)
		   	 + String.format("%-20s%20s\n", "Account Name: ", name)
		   	 + String.format("%-20s%20s\n", "Balance: ", currentBalance() - deposit)
		   	 + String.format("%-20s%20s\n", "Deposit: ", deposit)	   	 
		   	 + String.format("%-20s%20s\n", "New Balance: ", currentBalance())
		   	 + "-------------------------------------------\n";
	}
	
	/** Method to display withdrawal information to screen. */
	public String displayWithdraw(float w)
	{
		
		if (currentBalance() - w > 20)
		{
			withdraw = w;
			
			return "FA2022_BankService_Caddell.java\n"
					 + "ONLINE BANK – Cory Caddell\n"
				   	 + "-------------------------------------------"
				   	 + "WITHDRAW"
				   	 + String.format("%-20s%20s\n", "Account Number: ", accountNumber)
				   	 + String.format("%-20s%20s\n", "Account Name: ", name)
				   	 + String.format("%-20s%20s\n", "Balance: ", currentBalance() + withdraw)
				   	 + String.format("%-20s%25s\n", "Deposit: ", withdraw)
				   	 + String.format("%-20s%20s\n", "New Balance: ", currentBalance())
				   	 + "-------------------------------------------\n";	
		}
		else
		{
			return "FA2022_BankService_Caddell.java\n"
					 + "ONLINE BANK – Cory Caddell\n"
				   	 + "-------------------------------------------"
				   	 + "WITHDRAW"
				   	 + String.format("%-20s%20s\n", "Account Number: ", accountNumber)
				   	 + String.format("%-20s%20s\n", "Account Name: ", name)
				   	 + String.format("%-20s%20s\n", "Balance: ", currentBalance() + withdraw)
				   	 + String.format("%-20s%25s\n", "Deposit: ", withdraw + " - denied")
				   	 + String.format("%-20s%20s\n", "New Balance: ", currentBalance() + withdraw)
				   	 + "-------------------------------------------\n";
			
		}
	}
		
	/** Method to calculate interest and display information to screen. */
	public String bankStatement()
	{
		float interest;
		interest = currentBalance() + currentBalance() * interestRate;
		
		return "FA2022_BankService_Caddell.java\n"
		 + "ONLINE BANK – Cory Caddell\n"
	   	 + "-------------------------------------------"
	   	 + "BANK STATEMENT"
	   	 + String.format("%-20s%20s\n", "Statement Date: ", "DATE!!!!")				//Need to import statement date
	   	 + String.format("%-20s%20s\n", "Account Number: ", accountNumber)
	   	 + String.format("%-20s%20s\n", "Account Name: ", name)
	   	 + String.format("%-20s%20s\n", "Balance: ", currentBalance())
	   	 + String.format("%-20s%20s\n", "Interest Rate: ", interestRate)
	   	 + String.format("%-20s%20s\n", "Interest Amount: ", interest)
	   	 + String.format("%-20s%20s\n", "New Balance: ", currentBalance() + interest)
	   	 + "-------------------------------------------\n";
	}
		

	
	
				
	
	

	

}
