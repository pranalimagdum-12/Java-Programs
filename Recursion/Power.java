public class Power{
    public static int CalcPower(int x, int n){
        if(n == 0){ //Base case 1
            return 1;
        }
        if(x == 0){
            return 0; //Base case2
        }
        int xPownm1 = CalcPower(x, n-1);
        int xPown = x* xPownm1;
        return xPown;

    }
    public static void main(String args[]){
        int x =2, n =5;
        int ans  =CalcPower(x,n);
        System.out.println(ans);

    }
}