import java.util.*;

public class Factorial {

    public static int PrintFactorial(int n) {
        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

        return factorial; // return valuee
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = PrintFactorial(n);
        System.out.println("Factorial = " + result);
    }
}
