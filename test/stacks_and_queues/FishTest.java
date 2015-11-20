package stacks_and_queues;

import codility.stacks_and_queues.Fish;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by chack on 11/20/2015.
 */
public class FishTest extends TestCase {
    static Fish fish;

    @BeforeClass
    public static void initialize(){
        fish = new Fish();
    }

    @Test
    public void testEatingFish(){
        Fish fish = new Fish();
        int [] sizes = {4,3,2,1,5};
        int [] directions = {0,1,0,0,0};
        assertEquals(2, fish.solution(sizes, directions));
    }

    @Test
    public void testEmptyPond(){
        Fish fish = new Fish();
        int [] sizes = {};
        int [] directions = {};
        assertEquals(0, fish.solution(sizes, directions));
    }

    @Test
    public void testOneFishPond(){
        Fish fish = new Fish();
        int [] sizes = {4};
        int [] directions = {0};
        assertEquals(1, fish.solution(sizes, directions));
    }

    @Test
    public void testAllFishSameDirection(){
        Fish fish = new Fish();
        int [] sizes = {4,3,2,1,5};
        int [] directions = {0,0,0,0,0};
        assertEquals(5, fish.solution(sizes, directions));
    }

    @Test
    public void testSmallPondFishOpposite(){
        Fish fish = new Fish();
        int [] sizes = {4,3};
        int [] directions = {0,1};
        assertEquals(1, fish.solution(sizes, directions));
    }
}
