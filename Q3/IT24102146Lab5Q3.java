import java.util.Scanner;

public class IT24102146Lab5Q3 {
   
    static final Double ROOM_CHARGE_PER_DAY = 48000.00;
    static final Double DISCOUNT_LESSTHAN3_DAYS = 0.0;
    static final Double DISCOUNT_3to4_DAYS = 0.1;
    static final Double DISCOUNT_5orMORE_DAYS = 0.2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter start date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter end date (1-31): ");
        int endDate = scanner.nextInt();

   
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates should be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than end date.");
            return;
        }

    
        int daysReserved = endDate - startDate;

    
        Double discount = 0.0;
        if (daysReserved >= 5) {
            discount = DISCOUNT_5orMORE_DAYS;
        } else if (daysReserved >= DISCOUNT_3to4_DAYS) {
            discount = DISCOUNT_3to4_DAYS;
        }

  
        Double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
        Double discountAmount = (totalAmount * discount) ;
        totalAmount -= discountAmount;

        System.out.println(" ");
        System.out.println("Room Chare per Day: Rs. " +ROOM_CHARGE_PER_DAY);
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total amount to be paid: Rs " + totalAmount);
    }
}