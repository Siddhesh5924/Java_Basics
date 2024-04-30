package Operator_Progs;
import java.util.Scanner;


public class SpringSeason {
    public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);
    System.out.print("Enter month between 1 to 12 : ");
        int m = scanner.nextInt();
        System.out.print("Enter day between 1 to 31: ");
        int d = scanner.nextInt();
        System.out.print(m+" month " + d+" day is ");
        if(m ==3 && d >=20 && d<= 31){
            System.out.println("Spring Season");
            
        }
        else if(m == 4 && d >=1 && d<=30){
            System.out.println("Spring Season");
        }
        else if (m == 5 && d >=1 && d<=31){
            System.out.println("Spring season");
        }
        else if (m == 6 && d >=1 && d<=20){
            System.out.println("Spring seaon");

        }
        else{
            System.out.println("Not a Spring Season");
        }
        scanner.close();
    }
}