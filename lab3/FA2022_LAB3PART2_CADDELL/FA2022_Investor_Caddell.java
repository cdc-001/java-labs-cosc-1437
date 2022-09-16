// File Name: FA2022_Investor_Caddell.java

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
	
	// Create mutator methods
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
	// Create accessor methods
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
	
	// Create operator methods
	public float calcTotalInvest()
	{
		return pricePerShare * numOfShares;
	}
	
	public float calcInterest()
	{
		return calcTotalInvest() * annualDiv;
	}
	
	public float calcTotalReturn()
	{
		return calcTotalInvest() + calcInterest();
	}
	
	public String toString()
	{
		String str;
		
		str = "FA2022_ShareInvestmentCalculator_Caddell.java\n"
				+ "FALL 2022 semester – Cory Caddell\n"
				+ "---------------------------------------------\n"
				+ String.format("Name of investor:             %15s", name) + "\n"
				+ String.format("Number of shares:             %15d", numOfShares) + "\n"
				+ String.format("Price of each share:          %15.2f", pricePerShare) + "\n"
				+ String.format("Percentage of yearly dividend:%15.2f%%", annualDiv * 100) + "\n"
				+ String.format("Money invested:    	      %15.2f", calcTotalInvest()) + "\n"
				+ String.format("Interest Amount:    	      %15.2f", calcInterest()) + "\n"
				+ "---------------------------------------------\n"
				+ String.format("Total money at the end of year:%14.2f", calcTotalReturn()) + "\n";
		
		return str;
	}
	
	

}
