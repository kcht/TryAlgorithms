package scjp;



class Small {
    public Small() {
        System.out.print("a ");
    }
}

class Small2  extends Small {
    public Small2() {
        System.out.print("b ");
    }
}

class Small3 extends Small2 {
    public Small3(int n) {
        System.out.print("c ");
    }
}

public class SmallTest {
    public static void main(String args[]) {
        new Small3(3);
    }
}