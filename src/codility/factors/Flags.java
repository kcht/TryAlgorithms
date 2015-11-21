package codility.factors;

import java.util.ArrayList;

/**
 * Created by chack on 11/21/2015.
 */
public class Flags {

    public int solution(int A[], int N){

        if(A == null || A.length ==0 || N==0){
          return 0;
        }
        ArrayList<Integer> peaksIndexes = new ArrayList<Integer>();
        for(int i=1; i<A.length - 1; i++){
            if(A[i-1] < A[i] && A[i+1]<A[i]){
                peaksIndexes.add(i);
            }
        }

        if(peaksIndexes.isEmpty()){
            return 0;
        }

        int maxNumberOfFlags =1;


        for(int k = 2; k <=peaksIndexes.size(); k++) {
            int lastFlaggedPeakIndex =0;
            int numberOfFlags = 1; //flag on the first one is a good idea
            for (int i = 1; i < peaksIndexes.size(); i++) {
                if (peaksIndexes.get(i) - peaksIndexes.get(lastFlaggedPeakIndex) >= k) {
                    numberOfFlags++;
                    lastFlaggedPeakIndex = i;
                }
            }

            if(numberOfFlags > k){
                numberOfFlags = k;
            }

            if(numberOfFlags > maxNumberOfFlags){
                maxNumberOfFlags = numberOfFlags;
            }
        }

        return maxNumberOfFlags;
    }

    //nlogn
    public int solutionBisection(int A[], int N){

        if(A == null || A.length ==0 || N==0){
            return 0;
        }
        ArrayList<Integer> peaksIndexes = new ArrayList<Integer>();
        for(int i=1; i<A.length - 1; i++){
            if(A[i-1] < A[i] && A[i+1]<A[i]){
                peaksIndexes.add(i);
            }
        }

        if(peaksIndexes.isEmpty()){
            return 0;
        }

        int maxNumberOfFlags =1;


        for(int k = 2; k <=peaksIndexes.size(); k++) {
            int lastFlaggedPeakIndex =0;
            int numberOfFlags = 1; //flag on the first one is a good idea
            for (int i = 1; i < peaksIndexes.size(); i++) {
                if (peaksIndexes.get(i) - peaksIndexes.get(lastFlaggedPeakIndex) >= k) {
                    numberOfFlags++;
                    lastFlaggedPeakIndex = i;
                }
            }

            if(numberOfFlags > k){
                numberOfFlags = k;
            }

            if(numberOfFlags > maxNumberOfFlags){
                maxNumberOfFlags = numberOfFlags;
            }
        }

        return maxNumberOfFlags;
    }


}
