package Functions.Methods;

public class Method {  
    public static void main(String[] args){
        // Add(2,3);
        // Add(100,200);
        // Add(200 ,300);
        int sum = Add(2,3);
        int result = sum*5;
        System.out.println(result);



    }
    public static void SayHello(String name){
        System.out.println("Heyy "+ name);
    }
    public static int Add(int a, int b){
        // System.out.println(a + b);
        return (a+b);

    }
    
}

