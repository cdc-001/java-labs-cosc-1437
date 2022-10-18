//FA2022_BankAccount_Caddell.java

public class FA2022_BankAccount_Caddell 
{
	private String name;
	private String accountNumber;
	private float interestRate;
	private float openingBalance;
	
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

}
