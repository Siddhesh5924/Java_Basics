package loops;
public class for_loop {
    public static void main (String[] args){
    // Write a Program to reverse the integer number eg. Input n=231 reverse is 132
    // int num = 122;
    int[] arr = {35,6,23,7,55,8,90};
    char[] num;
    String str = String.valueOf(num);
    int reverse_num = 0;

    for(int i = str.length() - 1; i >=0 ;i--){
        reverse_num += str.charAt(i);
        if(num == reverse_num){
    System.out.println("The num is palindrome");
    }
    else{
        System.out.println("The num is not palindrome");

    }
    }
    
    }
    
    
}


