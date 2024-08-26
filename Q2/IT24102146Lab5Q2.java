import java.util.Scanner;
public class IT24102146Lab5Q2
{

	
    
    public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		char no_of_cus;
		
		System.out.print("Enter the number of customers introduced: ");
		no_of_cus = input.next().charAt(0);
        
		System.out.println(" " );
		
		switch(no_of_cus)
        {
            case '0' :System.out.print("No Price ");
                break;

            case '1' : System.out.print("Price is a : Bag ");
                break;
            
            case '2' : System.out.print("Price is a : Umbrella");
                break;

            case '3' : System.out.print("Price is a : Bag");
                break;
       
            case '4' : System.out.print("Price is a : Traveling Chair");
                break;
       
            default  :
            if (no_of_cus >=5) System.out.print("Price is a : Headphone");
            else;
                System.out.print("Input must be number 0 or greater");
                
         }
	}
}