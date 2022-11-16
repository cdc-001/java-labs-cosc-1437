//FA2022_Employee_Caddell.java


public class FA2022_Employee_Caddell extends  FA2022_Person
{
	protected float salaryRate;
	
	public FA2022_Employee_Caddell()
	{
		super();
		salaryRate = 0.0f;
	}
	public FA2022_Employee_Caddell(String num, String last, String first, String phoneN, String addr, float sr)
	{
		super(num, last, first, phoneN, addr);
		salaryRate  = sr;	
	}
	//mutator methods
	public void setSalaryRate(float sr)
	{
		salaryRate = sr;
	}
	//assessor methods
	public float getSalaryRate()
	{
		return salaryRate;
	}
	//method to calculate weekly salary
	public float salaryOneWeek()
	{
		if (salaryRate < 1000)
		{
			return salaryRate * 40;
		}
		else
		{
			return salaryRate / 52;
		}
	}
	//method toString()
	public String toString()
	{
		return super.toString() + 
			   String.format("%-15s%32.2f\n", "Salary Rate: ", salaryRate) +
			   String.format("%-15s%30.2f\n", "Salary per Week: ", salaryOneWeek());		  
	}
}