import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int original_num = number;
        String str = String.valueOf(original_num);
        int reversed_num = 0;


        for(int i = 0; i<str.length();i++){
            int digit = original_num % 10;
            reversed_num = reversed_num * 10 + digit;
            original_num = original_num/10;
        }
            if(number == reversed_num){
                System.out.println("This num is a palindrome");
            }
    }
}

