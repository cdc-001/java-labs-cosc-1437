
import java.util.Scanner;
import java.io.*;
public class Testing 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner keyboard = new Scanner(System.in);
		
		// Question 1
		int numIndex = 3,				// Base value
		 	numIncrement = 3,			// Increase in base value.  Increment will increase by one after each loop.
		 	size = 8;					// Number of iterations.
		int	numSum = numIndex;			// Sum of all iterations of base number.
		
		for (int i = 0; i < size; i++)
		{				
			System.out.print(numIndex + ", ");
			numIndex += numIncrement++;
			numSum += numIndex;
		}
		System.out.println(numIndex);	// Display outside of loop to not have comma print after number
		System.out.println("Sum of these numbers is: " + numSum + "\n\n");
		
		
		// Question 2A
		
		int count = 0;
		int number, temp = 1, product = 1;
		
		
		while (product <= 3000 )
		{	
			System.out.print("Enter a number: ");
			number = keyboard.nextInt();
			
			product *= number;
			temp = product / number;
	
			count++;
			
			if (product > 3000)	//Count would need to be initialized with value of zero to display outside of loop.
			{
			System.out.println("At count = " + count + "\n" +
					"Previous = " + temp + "\n" +
					"number =  "  + number + "\n" +
					"product = " + product + "\n\n");
			}
		}
		

		
		// Question 2B - The while loop will run zero time if product is initialized with a value of 3200.
		
		// Question 3A
		
		count = 0;
		number = 0;
		temp = 1 ;
		product = 1;
		
		do
		{
			System.out.print("Enter a number: ");
			number = keyboard.nextInt();
			
			product *= number;
			
			temp = product / number;
		
			count++;
		} while (product <= 3000 );
		
		
		System.out.println("At count = " + count + "\n" +
				"Previous = " + temp + "\n" +
				"number =  "  + number + "\n" +
				"product = " + product + "\n\n");
		
		// Question 3B - If product is initialized with a value of 3,200 instead of 1, the do...while loop will iterate once.
		
		// Question 4A
		
		String studentID,
			   studentName;
		String input;
		char letterGrade;
		
		// Read input from keyboard
		
		keyboard.nextLine();
		
		System.out.print("Enter your student ID number: ");
		studentID = keyboard.nextLine();
		
		System.out.print("\nEnter your name: ");
		studentName = keyboard.nextLine();
		
		System.out.print("\nEnter your letter grade: ");
		input = keyboard.nextLine();
		letterGrade = input.charAt(0);
		
		// Open file
		
		PrintWriter outFile = new PrintWriter("student.txt");
		
		// Write to file
		
		outFile.println(studentID + " - " + studentName + " - " + letterGrade);
		
		// Close file
		
		outFile.close();
		
		// Question 4B
		
		File file = new File("student.txt");
		if (!file.exists())
		{
			System.out.println("File does not exist");
			System.exit(0);		}
		
		// Open file
		
		Scanner readFile = new Scanner(file);
		
		// Read and print line by line
		
		while (readFile.hasNextLine())
		{
			System.out.println("\n" + readFile.nextLine());
		}
		
		// Close file
		System.out.println("\nEnd of the file student.txt");
		readFile.close();
		
		// Question 5
		
		
		int selection;
		do
		{
			System.out.print("\nMENU\n1.Task 1 \n2.Task 2 \n3.Task 3\n0. Exit\n"
					+ "Type a number 1, 2, 3 to select a task or 0 to Exit: ");
			selection = keyboard.nextInt();
			
			switch (selection)
			{
				case 0:
					System.out.println("Exit the menu");
					break;
				case 1:
					System.out.println("Do task 1.");
					break;
				case 2:
					System.out.println("Do task 2");
					break;
				case 3:
					System.out.println("Do task 3");
					break;
				default:
					System.out.println("Invalid task, choose from 1, 2, 3, or 0");
					break;
			}
			
		}while(selection != 0);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
