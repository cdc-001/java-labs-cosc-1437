// FA2022_Investor_Caddell.java

public class FA2022_Investor_Caddell 
{
	// Declare data members
	private String name;
	private int numOfShares;
	private float pricePerShare;
	private float annualDiv;
	
	// Create constructors
	public FA2022_Investor_Caddell()
	{
		name = "";
		numOfShares = 0;
		pricePerShare = 0.0f;
		annualDiv = 0.0f;
	}
	
	public FA2022_Investor_Caddell(String nam, int numShares, float priceShare, float div)
	{
		name = nam;
		numOfShares = numShares;
		pricePerShare = priceShare;
		annualDiv = div;
	}
	
	// Create mutator methods with the name starting "set"
	public void setName(String nam)
	{
		name = nam;
	}
	public void setNumOfShares(int numShares)
	{
		numOfShares = numShares;
	}
	public void setPricePerShare(float priceShare)
	{
		pricePerShare = priceShare;
	}
	public void setAnnualDiv(float div)
	{
		annualDiv = div;
	}
	
	// Create accessor methods with the name starting "get"
	public String getName()
	{
		return name;
	}
	public int getNumOfShares()
	{
		return numOfShares;
	}
	public float getPricePerShare()
	{
		return pricePerShare;
	}
	public float getAnnualDiv()
	{
		return annualDiv;
	}
	
	// Method to calculate initial investment total
	public float calcTotalInvest()
	{
		return pricePerShare * numOfShares;
	}
	
	// Method to calculate interest
	public float calcInterest()
	{
		return calcTotalInvest() * annualDiv;
	}
	
	// Method to calculate ending investment total
	public float calcTotalReturn()
	{
		return calcTotalInvest() + calcInterest();
	}
	
	// Method toString to create output string and return
	public String toString()
	{	
		return "FA2022_ShareInvestmentCalculator_Caddell.java\n"
				+ "FALL 2022 semester – Cory Caddell\n"
				+ "----------------------------------------------\n"
				+ String.format("%-31s%15s\n", "Name of investor:", name)
				+ String.format("%-31s%15d\n", "Number of shares:", numOfShares)
				+ String.format("%-31s%15.2f\n", "Price of each share:", pricePerShare)
				+ String.format("%-31s%15.2f%%\n", "Percentage of yearly dividend:", annualDiv * 100)
				+ String.format("%-31s%15.2f\n", "Money invested:", calcTotalInvest())
				+ String.format("%-31s%15.2f\n", "Interest Amount:", calcInterest())
				+ "----------------------------------------------\n"
				+ String.format("%-31s%15.2f\n", "Total money at the end of year:", calcTotalReturn()); 

	}
}
