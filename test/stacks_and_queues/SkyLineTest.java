package stacks_and_queues;

import codility.stacks_and_queues.Fish;
import codility.stacks_and_queues.SkyLine;
import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by chack on 11/21/2015.
 */
public class SkyLineTest extends TestCase {
    static SkyLine skyline = new SkyLine();

    @Test
    public void testCountBlocks(){
        int [] heights = {8,8,5,7,9,8,7,4,8};
        assertEquals(7, skyline.solution(heights));
    }

    @Test
    public void testEmpty(){
        int [] heights = {};
        assertEquals(0, skyline.solution(heights));
    }

    @Test
    public void testOne(){
        int [] heights = {1};
        assertEquals(1, skyline.solution(heights));
    }

    @Test
    public void testSameHeight(){
        int [] heights = {5,5,5,5,5,5,5};
        assertEquals(1, skyline.solution(heights));
    }
}