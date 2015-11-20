package codility.sum;

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
public class PassingCarsTest extends TestCase {

    static PassingCars passingCars;

    @BeforeClass
    public static void initialize(){
        passingCars = new PassingCars();
    }
    @Test
    public void noPassingCarsLeft(){
        int [] tab = {0,0,0,0,0,0,0,0,0,0};
        assertEquals(0, passingCars.solution(tab, tab.length));
    }

    @Test
    public void noPassingCarsRight(){
        int [] tab = {1,1,1,1,1,1,1,1};
        assertEquals(0, passingCars.solution(tab,tab.length));
    }

    @Test
    public void somePassingCars(){
        int [] tab = {0,1,0,1,0,0,1};
        assertEquals(7, passingCars.solution(tab,tab.length));
    }

    @Test
    public void emptyArray(){
        int [] tab = {};
        assertEquals(0, passingCars.solution(tab,tab.length));
    }

    @Test
    public void oneCar(){
        int [] tab = {0};
        assertEquals(0, passingCars.solution(tab,tab.length));
    }

    @Test
    public void oneCarPassing(){
        int [] tab = {0,0,0,0,0,0,1,0,0,0};
        assertEquals(6, passingCars.solution(tab,tab.length));
    }


}

