import java.util.Scanner;
public class practice_problems {
    public static void main (String[] args){
// For Loop
// Ex- 1
        // Sum of n natural numbers
    //     int sum = 0;
    //     int i = 1;
    //     // for(int i = 1; i<=5; i++){
    //         while(i<=10){
    //         sum = sum + i;
    //         i++;
    //         }
    //         System.out.println("The sum of the first five natural numbers is: "+sum);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int number = Integer.parseInt(scanner.nextLine());

        boolean is_prime = true;
        
        if(number <= 1){
            is_prime = false;
        }
        else{
            for(int i = 2; i<=Math.sqrt(number);i++){
                if(number % i == 0){
                    is_prime = false;
                    break;
                }   
            }
        }
        if (is_prime){
            System.out.println("It is a Prime");
        }
        else{
            System.out.println("It is not a Prime");
        }

        scanner.close();

        


        }
    }





