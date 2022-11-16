//FA2022_StaticMethod_Caddell.java

public class FA2022_StaticMethod_Caddell 
{
	/** Method to calculate area of a square */
	public static double calcSquareArea(double len, double wid)
	{
		return len * wid;
	}
	
	/** Method to calculate area of a rectangle */
	public static double calcRectangleArea(double len, double wid)
	{
		return len * wid;
	}
	
	/** Method to calculate area of a triangle */
	public static double calcTriangleArea(double base, double height)
	{
		return base * height / 2;
	}
	
	/** Method to calculate area of a circle */
	public static double calcCircleArea(double rad)
	{
		return rad * rad * Math.PI;
	}
	
	/** Method to calculate area of a trapezoid */
	public static double calcTrapezoidArea(double base1, double base2, double height)
	{
		return (base1 + base2) * height / 2;
	}
	
	/** Method to calculate area of a parallelogram */
	public static double calcParallelogramArea(double base, double height)
	{
		return base * height;
	}	
}
