public class Main{
    public static void EvenSum(int i, int n, int sum){
       //Base condition
        if(i>n){
            System.out.println(sum);
            return;
    

        }
        //add only even numbers
        if(i%2==0){
            sum +=i;
        }
        //recursive call
       EvenSum(i + 1, n, sum);
    }
    public static void main(String args[]){
        EvenSum(1,10,0);
    }

    }
    