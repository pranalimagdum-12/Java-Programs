//4.Write a function which takes in the radius as input and returns the circumference of the circle.
import java.util.Scanner;
public class Circumference{
    public static int Circle(int r){
        System.out.println("The circumference of the circle is:" +(2*3.14*r));
        return 1;
    }

        
        
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle:");
        int r = sc.nextInt();
        Circle(r);



    }

    }
