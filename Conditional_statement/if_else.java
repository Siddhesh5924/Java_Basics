package Conditional_statement;
import java.util.Scanner;

public class if_else {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int number = scanner.nextInt();

        if (number >=0 && number <= 9){
            String word = "";
            switch(number){
                case 0:
                word = "Zero";
                break;
                case 1:
                word = "One";
                break;
                case 2:
                word = "Two";
                break;
                case 3:
                word = "Three";
                break;
                case 4:
                word = "Four";
                break;
                case 5:
                word = "Five";
                break;
            }
            System.out.println("Word representation: " + word);
        }else{
            System.out.println("Invalid input. Please enter a single-digit number (0-9).");
        }
    }
    
}


