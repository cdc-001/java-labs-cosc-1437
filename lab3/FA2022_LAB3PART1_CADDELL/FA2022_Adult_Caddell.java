
public class FA2022_Adult_Caddell 
{
	// Fields/DataMember/Attribute
	private String name;
	private int height;
	private int weight;
	
	// Constructors
	public FA2022_Adult_Caddell()
	{
		name = "";
		height = 0;
		weight = 0;
	}
	
	public FA2022_Adult_Caddell(String nme, int hght, int wght)
	{
		name = nme;
		height = hght;
		weight = wght;
	}
	
	// Mutator Methods
	public void setHeight(int hght)
	{
		height = hght;
	}
	
	public void setWeight(int wght)
	{
		weight = wght;
	}
	
	// Accessor Methods
	public String getName()
	{
		return name;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	// Operator Methods
	
	public float calculateBMI() 
	{		
		return (weight * 703) / (height * height);
	}
	
	public String toString()
	{
		String str;
		
		str = "---------------------------------------------\n"
			+ "File: FA2022_YourBMI_Rate_Caddell.java\n"
			+ "Your BMI Calculator – Caddell\n"
			+ "Standard BMI:            18.5 – 24.9\n"
			+ "---------------------------------------------\n"
			+ String.format("Name:                %15s", name) + "\n"
			+ String.format("Height:              %15s", height) + "\n"
			+ String.format("Weight:              %15s", weight) + "\n"
			+ "---------------------------------------------\n"
			+ String.format("BMI:                 %15s", calculateBMI()) + "\n";
		
		return str;
	}
	
	
	
}
