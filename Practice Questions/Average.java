//Enter 3 numbers from the user and make a function to print their average
import java.util.Scanner;
public class Average{
    public static int AvgNumbers(int a,int b,int c){
    System.out.println("The average of three numbers is:"+(a+b+c)/3);
    return 1;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
         int b = sc.nextInt();
         System.out.print("Enter c:");
          int c = sc.nextInt();
           AvgNumbers(a, b, c);



    }
}