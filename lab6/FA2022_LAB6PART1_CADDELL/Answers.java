
import java.io.*;
import java.util.*;

public class Answers 
{
	public static void main(String[] args)
	{
		//1A: 79
		//1B: 128
		//1C: 38
		
		int[] numbers = { 25, 37, 46, 18, 79, 69, 55};
		
		System.out.println(numbers[4]);
		
		int x = numbers[3] + 2 * numbers[6];
		System.out.println(x);
		
		x = ++numbers[1];
		System.out.println(x);
		
		/* 2A:
		 * correct: sets each data member for the first object at subscript 0 in the array
		 * 
		 * 2B:
		 * correct: sets the unit count data member to 365 for the second object at subscript 1 in the array.
		 * 
		 * 2C:
		 * incorrect: the code should be "items[1].setUnitCount(412);" to set the unit count data member to 412 for the second object at subscript 1 in the array. 
		 * 
		 * 2D:
		 * correct: this code will display to screen the unit count for the second object at subscript 1 in the array.
		 */
		
		/*3: 
		 * for(int i = 0; i < arrayNumber.length; i++)
		 * {
		 *		outputFile.println("Numbers" + i + " = " + arrayNumber[i];
		 * }
		 */
		
		/*4: 
		 * public class MorningExcerciseMonitor_Caddell
		 * {
		 * 		private String name;
		 * 		private float[] distances;
		 * 
		 * 		//No-argument constructor
		 * 		public MorningExerciseMonitor_Caddell()
		 * 		{
		 * 			name = "";
		 * 			distances = new float[7];
		 * 		}
		 * 
		 * 		//Parameterized constructor accepting name and distance array as arguments
		 * 		public MorningExerciseMonitor_Caddell(String n, float[] d)
		 * 		{
		 * 			name = n;
		 * 			for (int i = 0; 0 < d.length; i++)
		 * 			{
		 * 				distance[i] = d[i];
		 * 			}
		 * 		}
		 * 
		 * 		//Display contents of object to screen
		 * 		public String toString()
		 * 		{		 
		 * 			String distanceDisplay = "";
		 *	  		for (int i = 0; i < distance.length; i++)
		 *			{
		 *				s += ((i > 0) ? ", " : "") + distance[i];  //Ternary used to keep comma from printing after last number.
		 *			}
		 * 
		 * 			return "PERSON\n" +
		 * 				   "Name = " + name + "\n" +
		 * 				   "Week Exercise Distance = " + distanceDisplay);
		 * 		}
		 */	
		
		String name = "Cory";
		float[] distance = {2.1f, 2.2f, 2.3f, 2.4f, 2.5f, 2.6f, 2.7f};
		
		String s = "";
		
		for (int i = 0; i < distance.length; i++)
		{
			s += ((i > 0) ? ", " : "") + distance[i];
		}
		
		System.out.print("Person\n"
				+ "Name = " + name +"\n"
				+ "Week Exercise Distance = " + s);
		
		
	}
	
	public static void displayDistance(float[] d)
	{
		for (int i = 0; i < d.length; i++)
		{
			System.out.print(((i > 0) ? ", " : "") + d[i]);
		}
	}
}
