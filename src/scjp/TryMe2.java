package scjp;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TryMe2 {
    public static void main(String args[]) {
        List list = new LinkedList<String>();
        list.add("one");
        list.add("two");
        list.add("three");

        Collections.reverse(list);
        Iterator iter = list.iterator();

//        for (Object o : iter) { //nie mozna iterowac po iteratorze!
//            System.out.print(o + " ");
//        }
    }
}