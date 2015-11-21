package codility.stacks_and_queues;

import java.util.Queue;
import java.util.Stack;

/**
 * Created by chack on 11/21/2015.
 */
public class SkyLine {

        public int solution(int[] H) {
            // write your code in Java SE 8
            if(H.length == 0){
                return 0;
            }
            Stack<Integer> stack = new Stack();

            int numberOfBlocks = 0;

            for(int elem: H){
                while(!stack.isEmpty() && stack.peek() > elem ){
                    stack.pop();
                    numberOfBlocks++;
                }
                if(stack.isEmpty() || stack.peek() < elem){
                    stack.push(elem);
                }


            }

            return numberOfBlocks + stack.size();
        }
}
