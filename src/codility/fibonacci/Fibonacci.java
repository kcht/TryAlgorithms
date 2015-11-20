package codility.fibonacci;

/**
 * Created by chack on 11/20/2015.
 */

public class Fibonacci {
    public static int fibRec(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibRec(n-1) + fibRec(n-2);
    }

    public static int fibIter(int n){
        if(n<=1) {
            return n;
        }
        int [] fib_numbers = new int [n+1];
        fib_numbers[0] = 0;
        fib_numbers[1] = 1;
        for(int i=2; i<=n; i++){
            fib_numbers[i] = fib_numbers[i-1] + fib_numbers[i-2];
        }
        return fib_numbers[n];
    }
}
