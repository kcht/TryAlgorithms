package codility.sorting;

import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chack on 11/19/2015.
 */
//
//public static void assertEquals(String message,
//        double expected,
//        double actual,
//        double delta)
public class TriangleTest extends TestCase{

    static Triangle triangle;

    @BeforeClass
    public static void initialize(){
        triangle = new Triangle();
    }
    @Test
    public void simpleTriangleExists(){
        int [] tab = {12,4,32,3,5};
        assertEquals(1, triangle.solution(tab));
    }

    @Test
    public void simpleTriangleDoesntExist(){
        int [] tab = {12,4,32,5};
        assertEquals(0, triangle.solution(tab));
    }

    @Test
    public void notEnoughArgumentsInArray(){
        int [] tab = {1,2};
        assertEquals(0, triangle.solution(tab));
    }

    @Test
    public void sameNumbersInArray(){
        int [] tab = {1,1,1,1,1,1};
        assertEquals(1, triangle.solution(tab));
    }

    @Test
    public void emptyArray(){
        int [] tab = {};
        assertEquals(0, triangle.solution(tab));
    }

    @Test
    public void zeroElementInArray(){
        int [] tab = {0,5,4};
        assertEquals(0, triangle.solution(tab));
    }

    @Test
    public void negativeElementsInArray(){
        int [] tab = {-2,3,4,-9};
        assertEquals(0, triangle.solution(tab));
    }

    @Test
    public void borderCase(){
        int [] tab = {9,8,17,100};
        assertEquals(0, triangle.solution(tab));
    }

    @Test
    public void maxIntegerValues(){
        int [] tab = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        assertEquals(1, triangle.solution(tab));
    }
}
