package factors;

import codility.factors.Flags;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by chack on 11/21/2015.
 */
public class FlagsTest extends TestCase {
    Flags flags = new Flags();

    @Test
    public void testSimple(){
        int []  A = {1,5,3,4,3,4,1,2,3,4,6,2};
        int N = A.length;
        assertEquals(3, flags.solution(A,N));
    }

    @Test
    public void testSimple2(){
        int [] A = {2,3,6,4,3,4,7,8,5,4,7,8,3,3,4,6,1};
        int N = A.length;
        assertEquals(4 , flags.solution(A,N));
    }

    @Test
    public void testNoPeaks(){
        int [] A = {1,2,3,4,5,6,7,8};
        int N = A.length;
        assertEquals(0, flags.solution(A,N));
    }

    @Test
    public void testValley(){
        int [] A = {5,4,4,4,5};
        int N = A.length;
        assertEquals(0, flags.solution(A,N));
    }

    @Test
    public void testPyramid(){
        int [] A = {1,2,3,4,5,4,3,2,1};
        int N = A.length;
        assertEquals(1, flags.solution(A,N));
    }

    @Test
    public void testPeak(){
        int [] A = {1,1,1,1,4,1,1,1,1};
        int N =A.length;
        assertEquals(1, flags.solution(A,N));
    }
}

