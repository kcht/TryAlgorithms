package scjp;

//v1
//public class TrickyNum<X extends Object> {
//
//    private X x;
//
//    public TrickyNum(X x) {
//        this.x = x;
//    }
//
//    private double getDouble() {
//      //  return x.doubleValue(); //the method is undefined for type X!
//    }
//
//    public static void main(String args[]) {
//        TrickyNum<Integer> a = new TrickyNum<Integer>(new Integer(1));
//        System.out.print(a.getDouble());
//        }
//        }

//v2 - runtime error
/*
public class TrickyNum<X extends Object> {

    private X x;

    public TrickyNum(X x) {
        this.x = x;
    }

    private double getDouble() {
        return ((Double) x).doubleValue();
    }

    public static void main(String args[]) {
        TrickyNum<Integer> a = new TrickyNum<Integer>(new Integer(1));
        System.out.print(a.getDouble());
    }
}
*/
//extends number wiec spoko
public class TrickyNum<X extends Number> {

    private X x;

    public TrickyNum(X x) {
        this.x = x;
    }

    private double getDouble() {
        return x.doubleValue();
    }

    public static void main(String args[]) {
        TrickyNum<Integer> a = new TrickyNum<Integer>(new Integer(1));
        System.out.print(a.getDouble());
    }
}