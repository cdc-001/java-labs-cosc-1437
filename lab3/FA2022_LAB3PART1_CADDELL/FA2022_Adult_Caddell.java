// FA2022_Adult_Caddell.java

public class FA2022_Adult_Caddell 
{
	//data members
	private String name;
	private int height;
	private float weight;
	
	//no-argument constructor
	public FA2022_Adult_Caddell()
	{
		name = "";
		height = 0;
		weight = 0.0f;
	}
	
	//parameterized constructor
	public FA2022_Adult_Caddell(String n, int h, float w)
	{
		name = n;
		height = h;
		weight = w;
	}
	
	//the following are mutator methods with the names starting "set"
	public void setName(String n)
	{
		name = n;
	}
	public void setHeight(int h)
	{
		height = h;
	}
	
	public void setWeight(int w)
	{
		weight = w;
	}
	
	//the following are accessor methods with the name starting "get"
	public String getName()
	{
		return name;
	}
	public int getHeight()
	{
		return height;
	}
	public float getWeight()
	{
		return weight;
	}
	
	//method to calculate the weight	
	public float calculateBMIRate() 
	{		
		float BMI = (weight * 703) / (height * height);
		return BMI;
	}
	
	//method toString to create the output string and return
	public String toString()
	{
		return "---------------------------------------------\n" +
				"File: FA2022_YourBMI_Rate_Caddell.java\n" + 
				"Calculate Your BMI Rate – Caddell\n" +
				"Standard BMI:            18.5 - 24.9\n" +
			    "---------------------------------------------\n" +
				String.format("%-15s%25s\n", "Name: ", name) +
				String.format("%-15s%25d\n", "Height: ", height) +
				String.format("%-15s%25.2f\n", "Weight: ", weight) +
				"---------------------------------------------\n" +
				String.format("%-15s%25.2f\n", "Your BMI Rate: ", calculateBMIRate()); //<==this is the way the get BMI rate
	}	
}
