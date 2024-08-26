import java.util.Scanner;
public class IT24102146Lab5Q1 
{

	
    public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int number1 , number2 , number3;
		
		System.out.print("Enter the first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		number2 = input.nextInt();
		
		System.out.print("Enter the third integer: " );
		number3 = input.nextInt();
        
		System.out.println(" " );
		
		int Smallest = number1;
		int Largest = number1;
		
		if (number2 < Smallest) {
			Smallest = number2;
		}
		
       if (number3 < Smallest) {
			Smallest = number3;
	   }
	   
	   if (number2 > Largest) {
		   Largest = number2;
	   }
		
		if (number3 > Largest) {
			Largest = number3;
		}
				
		System.out.println("User entered numbers are : " + number1 + " " + number2 + " " + number3);
		System.out.println("The smallest number is : " +Smallest);
		System.out.println("The largest number is : " +Largest);
	}
}