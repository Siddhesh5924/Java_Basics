import java.util.Scanner;
public class number_display {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a num(1, 10, 100 or 1000: )");
        int number = scanner.nextInt();

        if (number != 1 && number != 10 && number != 100 && number != 1000){
            System.out.println("Invalid input entered, please try again. ");
            return;
        }

        if( number == 1){
            System.out.println("One");
            
        }
        else if(number  == 10){
            System.out.println("Ten");
        }
        else if(number  == 100){
            System.out.println("Hundred");
        }
        else if(number  == 1000){
            System.out.println("Thousand");
        }
        else{
            System.out.println("Invalid Input MF");
        }
    }
  
}
    
