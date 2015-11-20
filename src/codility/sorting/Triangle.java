package codility.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by KCH on 18.11.2015.
 */
public class Triangle {

    public static void main(String... args){

        int[] testTab = {1,7,9,88,7,5};
        Triangle triangle = new Triangle();
        int result = triangle.solution(testTab);
        System.out.println(result);
    }

    public int solution(int[] A) {
        Arrays.sort(A);

        boolean triangleExists = false;
        for(int i=0; i<A.length-2; i++){
            if(A[i]+A[i+1] > A[i+2]){
                triangleExists = true;
            }
        }
        return triangleExists ? 1 : 0;
    }
}


/*A zero-indexed array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ? P < Q < R < N and:

        A[P] + A[Q] > A[R],
        A[Q] + A[R] > A[P],
        A[R] + A[P] > A[Q].
        For example, consider array A such that:

        A[0] = 10    A[1] = 2    A[2] = 5
        A[3] = 1     A[4] = 8    A[5] = 20
        Triplet (0, 2, 4) is triangular.

        Write a function:

class Solution { public int solution(int[] A); }

that, given a zero-indexed array A consisting of N integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.

        For example, given array A such that:

        A[0] = 10    A[1] = 2    A[2] = 5
        A[3] = 1     A[4] = 8    A[5] = 20
        the function should return 1, as explained above. Given array A such that:

        A[0] = 10    A[1] = 50    A[2] = 5
        A[3] = 1
        the function should return 0.

        Assume that:

        N is an integer within the range [0..100,000];
        each element of array A is an integer within the range [?2,147,483,648..2,147,483,647].
        Complexity:

        expected worst-case time complexity is O(N*log(N));
        expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
        Elements of input arrays can be modified.*/
