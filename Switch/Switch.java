package Switch;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        // Write a Program to Check Vowel or Consonant

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        
        char value = scanner.next().charAt(0);
        
        switch (Character.toLowerCase(value)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(value+" is a Vowel");
                break;
            default:
            System.out.println(value+" is not a vowel");
        }

    }
    
}
