package Switch;
import java.util.Scanner;
public class MonthName {

    // Write a Program to print the month name for the given number
    public static void main(String[] args){
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a month number: ");
        int months = scanner.nextInt();
        String month ;
        switch(months){
            case 1:
            System.out.println("Jan");
            break;
            case 2:
            System.out.println("Feb");
            break;
            case 3:
            System.out.println("MAr");
            break;
            case 4:
            System.out.println("Apr");
            break;
            case 5:
            System.out.println("may");
            break;
            case 6:
            System.out.println("jun");
            break;
            case 7:
            System.out.println("Jul");
            break;
            case 8:
            System.out.println("Aug");
            break;
            case 9:
            System.out.println("Sep");
            break;
            case 10:
            System.out.println("Oct");
            break;
            case 11:
            System.out.println("Nov");
            break;
            case 12:
            System.out.println("Dec");
            break;
            default:
            System.out.println("Invalid number entered, please enter between 1 to 12.");

        }
        scanner.close();
    }

    
}
