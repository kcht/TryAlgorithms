package scjp;

/**
 * Created by chack on 11/22/2015.
 */
public class StrangeMain {
    public static void main(String args[]) {
        Object myObj = new String[]{"one", "two", "three"};{
            for (String s : (String[])myObj) System.out.print(s + ".");
        }
    }
}
