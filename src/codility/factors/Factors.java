package codility.factors;

/**
 * Created by chack on 11/21/2015.
 */
public class Factors {

    public int solution(int n){
        if(n<=2){
            return n;
        }

        int factors = 0;
        for(int i=0; i<=n/2; i++){
            if(n%i ==0){
                factors++;
            }
        }
        factors ++;
        return factors;
    }
}
