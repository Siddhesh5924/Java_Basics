import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        double a = sc.nextDouble();
        System.out.println("Enter a num:");
        double b = sc.nextDouble();
        System.out.println("Enter a num:");
        double c = sc.nextDouble();

        double delta = b*b - 4*a*c;
        if (delta < 0){
            System.out.println("Roots are imaginary");
        }
        else{
            double root1 = (-b + Math.sqrt(delta))/(2*a);
            double root2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println(root1);
            System.out.println(root2);
        }


        
        sc.close();
    }
}
