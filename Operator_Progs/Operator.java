package Operator_Progs;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Input two nums
        System.out.println("Enter a num: ");
        double a = scanner.nextDouble();
        System.out.println("Enter a num: ");
        double b = scanner.nextDouble();

        // Perform arithmatic oprs
        double result1 = a+b*a;
        double result2 = a+a/b;
        double result3 = a%b+a;
        double result4 = a*b+a;

        // Max And Min
        double max = Math.max(result1, Math.max(result2, Math.max(result3, result4)));
        double min = Math.min(result1, Math.min(result2, Math.min(result3, result4)));

        // Outputs
        System.out.println("1.) a+b*a = "+result1);
        System.out.println("2.) a+a/b = "+result2);
        System.out.println("3.) a%b+a = "+result3);
        System.out.println("4.) a*b+a = "+result4);
        System.out.println("5.) "+max);
        System.out.println("6.) "+min);

        scanner.close();   
    }
}
