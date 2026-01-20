//3.Write a function which takes in 2 numbers and returns the greater of those two
import java.util.Scanner;
public class Comparison{
    public static int GreaterNumber(int a,int b){
        if(a > b){

            System.out.println("The greater no is:"+ a);
        }
        else {
             System.out.println("The greater no is:"+ b);
        }
           return 1;
    }
        
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
         int b = sc.nextInt();
         GreaterNumber(a, b);



    }
}