import java.util.*;
public class Add{
    public static int AddNumbers(int a, int b){
        System.out.println("addition is:" + (a+b));
        return 1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter first number:");
         int a = sc.nextInt();
        
        System.out.println("Enter first number:");
        int b = sc.nextInt();
        AddNumbers(a,b);
    }
        
    }